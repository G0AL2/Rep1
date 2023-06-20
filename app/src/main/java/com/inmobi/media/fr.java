package com.inmobi.media;

import org.json.JSONObject;

/* compiled from: Config.java */
@ik
/* loaded from: classes3.dex */
public abstract class fr {
    private gb includeIds = new gb();
    @ii
    private String mAccountId;

    public fr(String str) {
        this.mAccountId = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static fr a(String str, String str2) {
        char c10;
        switch (str.hashCode()) {
            case -60641721:
                if (str.equals("crashReporting")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 96432:
                if (str.equals("ads")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3506402:
                if (str.equals("root")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 780346297:
                if (str.equals("telemetry")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 2088265419:
                if (str.equals("signals")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 2) {
            if (c10 != 3) {
                if (c10 != 4) {
                    if (c10 != 5) {
                        return new fq(str2);
                    }
                    return new gf(str2);
                }
                return new ge(str2);
            }
            return new gd(str2);
        }
        return new ga(str2);
    }

    public abstract String b();

    public abstract JSONObject c();

    public abstract boolean d();

    public boolean equals(Object obj) {
        if (obj instanceof fr) {
            fr frVar = (fr) obj;
            if (frVar.b().equals(b())) {
                String str = this.mAccountId;
                return (str == null && frVar.mAccountId == null) || (str != null && str.equals(frVar.mAccountId));
            }
            return false;
        }
        return false;
    }

    public gb f() {
        return this.includeIds;
    }

    public String g() {
        return this.mAccountId;
    }

    public int hashCode() {
        int hashCode = b().hashCode();
        String str = this.mAccountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public static fr a(String str, JSONObject jSONObject, String str2) {
        ga a10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -60641721:
                if (str.equals("crashReporting")) {
                    c10 = 0;
                    break;
                }
                break;
            case 96432:
                if (str.equals("ads")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3506402:
                if (str.equals("root")) {
                    c10 = 2;
                    break;
                }
                break;
            case 780346297:
                if (str.equals("telemetry")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2088265419:
                if (str.equals("signals")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                a10 = ga.a().a(jSONObject, ga.class);
                break;
            case 1:
                a10 = fq.a().a(jSONObject, fq.class);
                break;
            case 2:
                a10 = gd.a().a(jSONObject, gd.class);
                break;
            case 3:
                a10 = gf.a().a(jSONObject, gf.class);
                break;
            case 4:
                a10 = ge.a().a(jSONObject, ge.class);
                break;
            default:
                a10 = null;
                break;
        }
        if (a10 != null) {
            a10.mAccountId = str2;
        }
        return a10;
    }
}
