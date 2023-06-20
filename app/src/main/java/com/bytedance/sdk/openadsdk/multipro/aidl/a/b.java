package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AppOpenAdListenerManagerImpl.java */
/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> f13464a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f13465b;

    public static b a() {
        if (f13465b == null) {
            synchronized (b.class) {
                if (f13465b == null) {
                    f13465b = new b();
                }
            }
        }
        return f13465b;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        a(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        f13464a.put(str, remoteCallbackList);
    }

    private synchronized void a(String str, String str2) {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList;
        try {
            if (f13464a != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = f13464a.remove(str);
                } else {
                    remoteCallbackList = f13464a.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i10 = 0; i10 < beginBroadcast; i10++) {
                        IAppOpenAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i10);
                        if (broadcastItem != null) {
                            if ("onAdShow".equals(str2)) {
                                broadcastItem.onAdShow();
                            } else if ("onAdClicked".equals(str2)) {
                                broadcastItem.onAdClicked();
                            } else if ("onAdSkip".equals(str2)) {
                                broadcastItem.onAdSkip();
                            } else if ("onAdTimeOver".equals(str2)) {
                                broadcastItem.onAdTimeOver();
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
            l.c("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th);
        }
    }
}
