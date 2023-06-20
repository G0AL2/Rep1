package com.iab.omid.library.ironsrc.b;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.e.a f24276a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24277b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f24278c;

    /* renamed from: d  reason: collision with root package name */
    private final String f24279d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f24276a = new com.iab.omid.library.ironsrc.e.a(view);
        this.f24277b = view.getClass().getCanonicalName();
        this.f24278c = friendlyObstructionPurpose;
        this.f24279d = str;
    }

    public com.iab.omid.library.ironsrc.e.a a() {
        return this.f24276a;
    }

    public String b() {
        return this.f24277b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f24278c;
    }

    public String d() {
        return this.f24279d;
    }
}
