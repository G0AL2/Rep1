package com.iab.omid.library.applovin.b;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final com.iab.omid.library.applovin.e.a f23928a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23929b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f23930c;

    /* renamed from: d  reason: collision with root package name */
    private final String f23931d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f23928a = new com.iab.omid.library.applovin.e.a(view);
        this.f23929b = view.getClass().getCanonicalName();
        this.f23930c = friendlyObstructionPurpose;
        this.f23931d = str;
    }

    public com.iab.omid.library.applovin.e.a a() {
        return this.f23928a;
    }

    public String b() {
        return this.f23929b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f23930c;
    }

    public String d() {
        return this.f23931d;
    }
}
