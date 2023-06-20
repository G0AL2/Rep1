package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.bannerexpress.a;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TTDislikeListView extends ListView {

    /* renamed from: a  reason: collision with root package name */
    protected IListenerManager f13197a;

    /* renamed from: b  reason: collision with root package name */
    private n f13198b;

    /* renamed from: c  reason: collision with root package name */
    private AdapterView.OnItemClickListener f13199c;

    /* renamed from: d  reason: collision with root package name */
    private String f13200d;

    /* renamed from: e  reason: collision with root package name */
    private AdapterView.OnItemClickListener f13201e;

    public TTDislikeListView(Context context) {
        super(context);
        this.f13201e = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                if (TTDislikeListView.this.getAdapter() != null && TTDislikeListView.this.getAdapter().getItem(i10) != null && (TTDislikeListView.this.getAdapter().getItem(i10) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) TTDislikeListView.this.getAdapter().getItem(i10);
                    if (!filterWord.hasSecondOptions()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(filterWord);
                        if (TTDislikeListView.this.f13198b != null) {
                            e.a(TTDislikeListView.this.f13198b, arrayList);
                        }
                        if (!TextUtils.isEmpty(TTDislikeListView.this.f13200d)) {
                            if (!com.bytedance.sdk.openadsdk.multipro.b.c()) {
                                a.InterfaceC0169a e10 = h.d().e(TTDislikeListView.this.f13200d);
                                if (e10 != null) {
                                    e10.a();
                                    h.d().f(TTDislikeListView.this.f13200d);
                                }
                            } else {
                                TTDislikeListView.this.a("onItemClickClosed");
                            }
                        }
                    }
                    try {
                        if (TTDislikeListView.this.f13199c != null) {
                            TTDislikeListView.this.f13199c.onItemClick(adapterView, view, i10, j10);
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                throw new IllegalArgumentException("Adapter data is abnormal, it must be FilterWord");
            }
        };
        a();
    }

    public void setClosedListenerKey(String str) {
        this.f13200d = str;
    }

    public void setMaterialMeta(n nVar) {
        this.f13198b = nVar;
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f13199c = onItemClickListener;
    }

    private void a() {
        super.setOnItemClickListener(this.f13201e);
    }

    public TTDislikeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13201e = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                if (TTDislikeListView.this.getAdapter() != null && TTDislikeListView.this.getAdapter().getItem(i10) != null && (TTDislikeListView.this.getAdapter().getItem(i10) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) TTDislikeListView.this.getAdapter().getItem(i10);
                    if (!filterWord.hasSecondOptions()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(filterWord);
                        if (TTDislikeListView.this.f13198b != null) {
                            e.a(TTDislikeListView.this.f13198b, arrayList);
                        }
                        if (!TextUtils.isEmpty(TTDislikeListView.this.f13200d)) {
                            if (!com.bytedance.sdk.openadsdk.multipro.b.c()) {
                                a.InterfaceC0169a e10 = h.d().e(TTDislikeListView.this.f13200d);
                                if (e10 != null) {
                                    e10.a();
                                    h.d().f(TTDislikeListView.this.f13200d);
                                }
                            } else {
                                TTDislikeListView.this.a("onItemClickClosed");
                            }
                        }
                    }
                    try {
                        if (TTDislikeListView.this.f13199c != null) {
                            TTDislikeListView.this.f13199c.onItemClick(adapterView, view, i10, j10);
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                throw new IllegalArgumentException("Adapter data is abnormal, it must be FilterWord");
            }
        };
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str) {
        com.bytedance.sdk.component.f.e.c(new g("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(TTDislikeListView.this.f13200d)) {
                        return;
                    }
                    TTDislikeListView.this.a(6).executeDisLikeClosedCallback(TTDislikeListView.this.f13200d, str);
                } catch (Throwable th) {
                    l.c("TTDislikeListView", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    protected IListenerManager a(int i10) {
        if (this.f13197a == null) {
            this.f13197a = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a()).a(i10));
        }
        return this.f13197a;
    }

    public TTDislikeListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13201e = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i102, long j10) {
                if (TTDislikeListView.this.getAdapter() != null && TTDislikeListView.this.getAdapter().getItem(i102) != null && (TTDislikeListView.this.getAdapter().getItem(i102) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) TTDislikeListView.this.getAdapter().getItem(i102);
                    if (!filterWord.hasSecondOptions()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(filterWord);
                        if (TTDislikeListView.this.f13198b != null) {
                            e.a(TTDislikeListView.this.f13198b, arrayList);
                        }
                        if (!TextUtils.isEmpty(TTDislikeListView.this.f13200d)) {
                            if (!com.bytedance.sdk.openadsdk.multipro.b.c()) {
                                a.InterfaceC0169a e10 = h.d().e(TTDislikeListView.this.f13200d);
                                if (e10 != null) {
                                    e10.a();
                                    h.d().f(TTDislikeListView.this.f13200d);
                                }
                            } else {
                                TTDislikeListView.this.a("onItemClickClosed");
                            }
                        }
                    }
                    try {
                        if (TTDislikeListView.this.f13199c != null) {
                            TTDislikeListView.this.f13199c.onItemClick(adapterView, view, i102, j10);
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                throw new IllegalArgumentException("Adapter data is abnormal, it must be FilterWord");
            }
        };
        a();
    }

    public static void a(final int i10, final String str, final a.InterfaceC0169a interfaceC0169a) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.component.f.e.c(new g("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.a a10 = com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a());
                    if (i10 == 6 && interfaceC0169a != null) {
                        try {
                            l.b("TTDislikeListView", "start registerDislikeClickCloseListener ! ");
                            com.bytedance.sdk.openadsdk.multipro.aidl.b.b bVar = new com.bytedance.sdk.openadsdk.multipro.aidl.b.b(str, interfaceC0169a);
                            IListenerManager asInterface = IListenerManager.Stub.asInterface(a10.a(6));
                            if (asInterface != null) {
                                asInterface.registerDisLikeClosedListener(str, bVar);
                                l.b("TTDislikeListView", "end registerDislikeClickCloseListener ! ");
                            }
                        } catch (RemoteException e10) {
                            e10.printStackTrace();
                            l.b("TTDislikeListView", "multiProcess registerDislikeClickCloseListener error");
                        }
                    }
                }
            }, 5);
        }
    }

    public static void a(final int i10, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.component.f.e.c(new g("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.4
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.a a10 = com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a());
                    if (i10 != 6) {
                        return;
                    }
                    try {
                        l.b("TTDislikeListView", "start unregisterDislikeClickCloseListener ! ");
                        IListenerManager asInterface = IListenerManager.Stub.asInterface(a10.a(6));
                        if (asInterface != null) {
                            asInterface.unregisterDisLikeClosedListener(str);
                            l.b("TTDislikeListView", "end unregisterDislikeClickCloseListener ! ");
                        }
                    } catch (RemoteException unused) {
                        l.b("TTDislikeListView", "multiProcess unregisterMultiProcessListener error");
                    }
                }
            }, 5);
        }
    }
}
