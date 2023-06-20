package vd;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: QueryInfoCallback.java */
/* loaded from: classes3.dex */
public class a extends QueryInfoGenerationCallback {

    /* renamed from: a  reason: collision with root package name */
    private com.unity3d.scar.adapter.common.a f38071a;

    /* renamed from: b  reason: collision with root package name */
    private b f38072b;

    public a(b bVar, com.unity3d.scar.adapter.common.a aVar) {
        this.f38071a = aVar;
        this.f38072b = bVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f38072b.e(str);
        this.f38071a.b();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f38072b.f(queryInfo);
        this.f38071a.b();
    }
}
