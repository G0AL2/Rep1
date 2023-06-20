package com.applovin.impl.sdk.a;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f8008a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendlyObstructionPurpose f8009b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8010c;

    public d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f8008a = view;
        this.f8009b = friendlyObstructionPurpose;
        this.f8010c = str;
    }

    public View a() {
        return this.f8008a;
    }

    public FriendlyObstructionPurpose b() {
        return this.f8009b;
    }

    public String c() {
        return this.f8010c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        View view = this.f8008a;
        if (view == null ? dVar.f8008a == null : view.equals(dVar.f8008a)) {
            if (this.f8009b != dVar.f8009b) {
                return false;
            }
            String str = this.f8010c;
            String str2 = dVar.f8010c;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public int hashCode() {
        View view = this.f8008a;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f8009b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f8010c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
