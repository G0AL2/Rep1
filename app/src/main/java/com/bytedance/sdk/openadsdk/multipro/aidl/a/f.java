package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FullScreenVideoListenerManagerImpl.java */
/* loaded from: classes.dex */
public class f extends a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> f13472a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    private static volatile f f13473b;

    public static f a() {
        if (f13473b == null) {
            synchronized (f.class) {
                if (f13473b == null) {
                    f13473b = new f();
                }
            }
        }
        return f13473b;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        a(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        f13472a.put(str, remoteCallbackList);
    }

    private synchronized void a(String str, String str2) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList;
        try {
            if (f13472a != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = f13472a.remove(str);
                } else {
                    remoteCallbackList = f13472a.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i10 = 0; i10 < beginBroadcast; i10++) {
                        IFullScreenVideoAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i10);
                        if (broadcastItem != null) {
                            if ("onAdShow".equals(str2)) {
                                broadcastItem.onAdShow();
                            } else if ("onAdClose".equals(str2)) {
                                broadcastItem.onAdClose();
                            } else if ("onVideoComplete".equals(str2)) {
                                broadcastItem.onVideoComplete();
                            } else if ("onSkippedVideo".equals(str2)) {
                                broadcastItem.onSkippedVideo();
                            } else if ("onAdVideoBarClick".equals(str2)) {
                                broadcastItem.onAdVideoBarClick();
                            } else if ("recycleRes".equals(str2)) {
                                broadcastItem.onDestroy();
                            }
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th) {
            l.c("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th);
        }
    }
}
