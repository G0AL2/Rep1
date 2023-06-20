package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* compiled from: CommonPermissionListenerManagerImpl.java */
/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, RemoteCallbackList<ICommonPermissionListener>> f13468a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f13469b;

    public static d a() {
        if (f13469b == null) {
            synchronized (d.class) {
                if (f13469b == null) {
                    f13469b = new d();
                }
            }
        }
        return f13469b;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        l.b("MultiProcess", "00000 CommonPermissionListenerManagerImpl broadcastDialogListener: 00000" + String.valueOf(str) + ", " + str2);
        RemoteCallbackList<ICommonPermissionListener> remove = f13468a.remove(str);
        if (remove == null) {
            return;
        }
        int beginBroadcast = remove.beginBroadcast();
        for (int i10 = 0; i10 < beginBroadcast; i10++) {
            ICommonPermissionListener broadcastItem = remove.getBroadcastItem(i10);
            if (broadcastItem != null) {
                l.b("MultiProcess", "CommonPermissionListenerManagerImpl broadcastDialogListener: " + String.valueOf(str) + ", " + str2);
                if (str2 == null) {
                    broadcastItem.onGranted();
                } else {
                    broadcastItem.onDenied(str2);
                }
            }
        }
        remove.finishBroadcast();
        remove.kill();
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener == null) {
            return;
        }
        l.b("MultiProcess", "CommonPermissionListenerManagerImpl registerPermissionListener");
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        f13468a.put(str, remoteCallbackList);
    }
}
