package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.b;
import com.chartboost.sdk.impl.f;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e implements com.chartboost.sdk.Model.d {

    /* renamed from: a  reason: collision with root package name */
    private final f f13962a;

    /* renamed from: b  reason: collision with root package name */
    private final n f13963b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar, n nVar) {
        this.f13962a = fVar;
        this.f13963b = nVar;
    }

    @Override // com.chartboost.sdk.Model.d
    public void a(com.chartboost.sdk.Model.c cVar) {
        f fVar = this.f13962a;
        Objects.requireNonNull(fVar);
        n nVar = this.f13963b;
        this.f13962a.f13966a.execute(new f.b(7, nVar.f14206b, nVar, cVar, null));
    }

    @Override // com.chartboost.sdk.Model.d
    public void b(com.chartboost.sdk.Model.c cVar) {
        cVar.f13685b = 1;
        if (this.f13962a.f13980o.a(this.f13963b.f14206b)) {
            this.f13962a.f13976k.b(cVar);
            return;
        }
        f fVar = this.f13962a;
        Objects.requireNonNull(fVar);
        n nVar = this.f13963b;
        this.f13962a.f13966a.execute(new f.b(7, nVar.f14206b, nVar, cVar, null));
    }

    @Override // com.chartboost.sdk.Model.d
    public void c(com.chartboost.sdk.Model.c cVar) {
        cVar.f13709z = true;
        f fVar = this.f13962a;
        Objects.requireNonNull(fVar);
        n nVar = this.f13963b;
        this.f13962a.f13966a.execute(new f.b(5, nVar.f14206b, nVar, cVar, null));
    }

    @Override // com.chartboost.sdk.Model.d
    public void a(com.chartboost.sdk.Model.c cVar, CBError.CBImpressionError cBImpressionError) {
        String str;
        String str2;
        com.chartboost.sdk.b bVar = this.f13962a.f13976k;
        Objects.requireNonNull(bVar);
        b.a aVar = new b.a(11);
        aVar.f13790c = cVar;
        com.chartboost.sdk.f.e(aVar);
        f fVar = this.f13962a;
        Objects.requireNonNull(fVar);
        n nVar = this.f13963b;
        this.f13962a.f13966a.execute(new f.b(6, nVar.f14206b, nVar, cVar, cBImpressionError));
        if (cVar != null) {
            str2 = cVar.f13695l;
            str = cVar.f13686c.f13935b;
        } else {
            str = "";
            str2 = str;
        }
        m1.d(new com.chartboost.sdk.Tracking.a("show_unexpected_dismiss_error", "", str, str2));
    }
}
