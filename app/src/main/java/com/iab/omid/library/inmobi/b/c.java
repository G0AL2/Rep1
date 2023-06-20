package com.iab.omid.library.inmobi.b;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final com.iab.omid.library.inmobi.e.a f24162a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24163b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f24164c;

    /* renamed from: d  reason: collision with root package name */
    private final String f24165d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f24162a = new com.iab.omid.library.inmobi.e.a(view);
        this.f24163b = view.getClass().getCanonicalName();
        this.f24164c = friendlyObstructionPurpose;
        this.f24165d = str;
    }

    public com.iab.omid.library.inmobi.e.a a() {
        return this.f24162a;
    }

    public String b() {
        return this.f24163b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f24164c;
    }

    public String d() {
        return this.f24165d;
    }
}
