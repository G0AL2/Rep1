package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.content.ContentValues;
import android.net.Uri;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.ICommonDialogListener;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import java.util.Map;

/* compiled from: AbstractListenerManager.java */
/* loaded from: classes.dex */
public abstract class a extends IListenerManager.Stub {
    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastDialogListener(String str, int i10) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public String getType(Uri uri) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public String insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public Map query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
