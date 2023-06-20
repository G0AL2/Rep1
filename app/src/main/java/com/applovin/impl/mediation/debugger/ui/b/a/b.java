package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.j;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final j.a f7622a;

    /* renamed from: o  reason: collision with root package name */
    private final Context f7623o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f7624p;

    public b(j.a aVar, boolean z10, Context context) {
        super(c.b.RIGHT_DETAIL);
        this.f7622a = aVar;
        this.f7623o = context;
        this.f7688d = new SpannedString(aVar.a());
        this.f7624p = z10;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public SpannedString c_() {
        return new SpannedString(this.f7622a.b(this.f7623o));
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean d_() {
        Boolean a10 = this.f7622a.a(this.f7623o);
        if (a10 != null) {
            return a10.equals(Boolean.valueOf(this.f7624p));
        }
        return false;
    }
}
