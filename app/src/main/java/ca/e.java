package ca;

import android.content.res.Resources;
import android.text.TextUtils;
import ea.n0;
import ea.v;
import j8.p1;
import java.util.Locale;

/* compiled from: DefaultTrackNameProvider.java */
/* loaded from: classes2.dex */
public class e implements o {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f5343a;

    public e(Resources resources) {
        this.f5343a = (Resources) ea.a.e(resources);
    }

    private String b(p1 p1Var) {
        int i10 = p1Var.f32722y;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 6 || i10 == 7) {
                    return this.f5343a.getString(m.f5400t);
                }
                if (i10 != 8) {
                    return this.f5343a.getString(m.f5399s);
                }
                return this.f5343a.getString(m.f5401u);
            }
            return this.f5343a.getString(m.f5398r);
        }
        return this.f5343a.getString(m.f5390j);
    }

    private String c(p1 p1Var) {
        int i10 = p1Var.f32705h;
        return i10 == -1 ? "" : this.f5343a.getString(m.f5389i, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(p1 p1Var) {
        return TextUtils.isEmpty(p1Var.f32699b) ? "" : p1Var.f32699b;
    }

    private String e(p1 p1Var) {
        String j10 = j(f(p1Var), h(p1Var));
        return TextUtils.isEmpty(j10) ? d(p1Var) : j10;
    }

    private String f(p1 p1Var) {
        String str = p1Var.f32700c;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale forLanguageTag = n0.f29709a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale R = n0.R();
        String displayName = forLanguageTag.getDisplayName(R);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            String valueOf = String.valueOf(displayName.substring(0, offsetByCodePoints).toUpperCase(R));
            String valueOf2 = String.valueOf(displayName.substring(offsetByCodePoints));
            displayName = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } catch (IndexOutOfBoundsException unused) {
        }
        return displayName;
    }

    private String g(p1 p1Var) {
        int i10 = p1Var.f32714q;
        int i11 = p1Var.f32715r;
        return (i10 == -1 || i11 == -1) ? "" : this.f5343a.getString(m.f5391k, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(p1 p1Var) {
        String string = (p1Var.f32702e & 2) != 0 ? this.f5343a.getString(m.f5392l) : "";
        if ((p1Var.f32702e & 4) != 0) {
            string = j(string, this.f5343a.getString(m.f5395o));
        }
        if ((p1Var.f32702e & 8) != 0) {
            string = j(string, this.f5343a.getString(m.f5394n));
        }
        return (p1Var.f32702e & 1088) != 0 ? j(string, this.f5343a.getString(m.f5393m)) : string;
    }

    private static int i(p1 p1Var) {
        int l10 = v.l(p1Var.f32709l);
        if (l10 != -1) {
            return l10;
        }
        if (v.o(p1Var.f32706i) != null) {
            return 2;
        }
        if (v.c(p1Var.f32706i) != null) {
            return 1;
        }
        if (p1Var.f32714q == -1 && p1Var.f32715r == -1) {
            return (p1Var.f32722y == -1 && p1Var.f32723z == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.f5343a.getString(m.f5388h, str, str2);
            }
        }
        return str;
    }

    @Override // ca.o
    public String a(p1 p1Var) {
        String e10;
        int i10 = i(p1Var);
        if (i10 == 2) {
            e10 = j(h(p1Var), g(p1Var), c(p1Var));
        } else if (i10 == 1) {
            e10 = j(e(p1Var), b(p1Var), c(p1Var));
        } else {
            e10 = e(p1Var);
        }
        return e10.length() == 0 ? this.f5343a.getString(m.f5402v) : e10;
    }
}
