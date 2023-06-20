package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: RewardAdVideoListenerManagerImpl.java */
/* loaded from: classes.dex */
public class h extends a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, RemoteCallbackList<IRewardAdInteractionListener>> f13475a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    private static volatile h f13476b;

    public static h a() {
        if (f13476b == null) {
            synchronized (h.class) {
                if (f13476b == null) {
                    f13476b = new h();
                }
            }
        }
        return f13476b;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) throws RemoteException {
        a(str, str2, z10, i10, str3, i11, str4);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iRewardAdInteractionListener);
        f13475a.put(str, remoteCallbackList);
    }

    private synchronized void a(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList;
        try {
            if (f13475a != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = f13475a.remove(str);
                } else {
                    remoteCallbackList = f13475a.get(str);
                }
                RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList2 = remoteCallbackList;
                if (remoteCallbackList2 != null) {
                    int beginBroadcast = remoteCallbackList2.beginBroadcast();
                    for (int i12 = 0; i12 < beginBroadcast; i12++) {
                        IRewardAdInteractionListener broadcastItem = remoteCallbackList2.getBroadcastItem(i12);
                        if (broadcastItem != null) {
                            if ("onAdShow".equals(str2)) {
                                broadcastItem.onAdShow();
                            } else if ("onAdClose".equals(str2)) {
                                broadcastItem.onAdClose();
                            } else if ("onVideoComplete".equals(str2)) {
                                broadcastItem.onVideoComplete();
                            } else if ("onVideoError".equals(str2)) {
                                broadcastItem.onVideoError();
                            } else if ("onAdVideoBarClick".equals(str2)) {
                                broadcastItem.onAdVideoBarClick();
                            } else if ("onRewardVerify".equals(str2)) {
                                broadcastItem.onRewardVerify(z10, i10, str3, i11, str4);
                            } else if ("onSkippedVideo".equals(str2)) {
                                broadcastItem.onSkippedVideo();
                            } else if ("recycleRes".equals(str2)) {
                                broadcastItem.onDestroy();
                            }
                        }
                    }
                    remoteCallbackList2.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList2.kill();
                    }
                }
            }
        } catch (Throwable th) {
            l.c("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th);
        }
    }
}
