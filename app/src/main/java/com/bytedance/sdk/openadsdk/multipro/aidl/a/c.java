package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonDialogListener;
import java.util.HashMap;

/* compiled from: CommonDialogListenerManagerImpl.java */
/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, RemoteCallbackList<ICommonDialogListener>> f13466a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f13467b;

    public static c a() {
        if (f13467b == null) {
            synchronized (c.class) {
                if (f13467b == null) {
                    f13467b = new c();
                }
            }
        }
        return f13467b;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastDialogListener(String str, int i10) throws RemoteException {
        RemoteCallbackList<ICommonDialogListener> remove = f13466a.remove(str);
        if (remove == null) {
            return;
        }
        int beginBroadcast = remove.beginBroadcast();
        for (int i11 = 0; i11 < beginBroadcast; i11++) {
            ICommonDialogListener broadcastItem = remove.getBroadcastItem(i11);
            if (broadcastItem != null) {
                if (i10 == 1) {
                    broadcastItem.onDialogBtnYes();
                } else if (i10 == 2) {
                    broadcastItem.onDialogBtnNo();
                } else if (i10 != 3) {
                    broadcastItem.onDialogCancel();
                } else {
                    broadcastItem.onDialogCancel();
                }
            }
        }
        remove.finishBroadcast();
        remove.kill();
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
        if (iCommonDialogListener == null) {
            return;
        }
        RemoteCallbackList<ICommonDialogListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonDialogListener);
        f13466a.put(str, remoteCallbackList);
    }
}
