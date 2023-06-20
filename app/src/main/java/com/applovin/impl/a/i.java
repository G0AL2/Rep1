package com.applovin.impl.a;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
import com.unity3d.ads.metadata.MediationMetaData;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private String f6785a;

    /* renamed from: b  reason: collision with root package name */
    private String f6786b;

    private i() {
    }

    public static i a(r rVar, i iVar, com.applovin.impl.sdk.m mVar) {
        if (rVar != null) {
            if (mVar != null) {
                if (iVar == null) {
                    try {
                        iVar = new i();
                    } catch (Throwable th) {
                        if (v.a()) {
                            mVar.A().b("VastSystemInfo", "Error occurred while initializing", th);
                            return null;
                        }
                        return null;
                    }
                }
                if (!StringUtils.isValidString(iVar.f6785a)) {
                    String c10 = rVar.c();
                    if (StringUtils.isValidString(c10)) {
                        iVar.f6785a = c10;
                    }
                }
                if (!StringUtils.isValidString(iVar.f6786b)) {
                    String str = rVar.b().get(MediationMetaData.KEY_VERSION);
                    if (StringUtils.isValidString(str)) {
                        iVar.f6786b = str;
                    }
                }
                return iVar;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String str = this.f6785a;
            if (str == null ? iVar.f6785a == null : str.equals(iVar.f6785a)) {
                String str2 = this.f6786b;
                String str3 = iVar.f6786b;
                return str2 != null ? str2.equals(str3) : str3 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6785a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6786b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f6785a + "', version='" + this.f6786b + "'}";
    }
}
