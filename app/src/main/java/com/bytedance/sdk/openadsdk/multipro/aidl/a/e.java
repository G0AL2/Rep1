package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DislikeClosedListenerManagerImpl.java */
/* loaded from: classes.dex */
public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> f13470a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f13471b;

    public static e a() {
        if (f13471b == null) {
            synchronized (e.class) {
                if (f13471b == null) {
                    f13471b = new e();
                }
            }
        }
        return f13471b;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        a(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        f13470a.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f13470a.remove(str);
    }

    private synchronized void a(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = f13470a;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i10 = 0; i10 < beginBroadcast; i10++) {
                    IDislikeClosedListener broadcastItem = remoteCallbackList.getBroadcastItem(i10);
                    if (broadcastItem != null && "onItemClickClosed".equals(str2)) {
                        broadcastItem.onItemClickClosed();
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            l.c("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
        }
    }
}
