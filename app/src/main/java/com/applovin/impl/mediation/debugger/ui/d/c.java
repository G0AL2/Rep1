package com.applovin.impl.mediation.debugger.ui.d;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    protected b f7686b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f7687c;

    /* renamed from: d  reason: collision with root package name */
    protected SpannedString f7688d;

    /* renamed from: e  reason: collision with root package name */
    protected SpannedString f7689e;

    /* renamed from: f  reason: collision with root package name */
    protected String f7690f;

    /* renamed from: g  reason: collision with root package name */
    protected String f7691g;

    /* renamed from: h  reason: collision with root package name */
    protected int f7692h;

    /* renamed from: i  reason: collision with root package name */
    protected int f7693i;

    /* renamed from: j  reason: collision with root package name */
    protected int f7694j;

    /* renamed from: k  reason: collision with root package name */
    protected int f7695k;

    /* renamed from: l  reason: collision with root package name */
    protected int f7696l;

    /* renamed from: m  reason: collision with root package name */
    protected int f7697m;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f7698n;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final b f7699a;

        /* renamed from: b  reason: collision with root package name */
        boolean f7700b;

        /* renamed from: c  reason: collision with root package name */
        SpannedString f7701c;

        /* renamed from: d  reason: collision with root package name */
        SpannedString f7702d;

        /* renamed from: e  reason: collision with root package name */
        String f7703e;

        /* renamed from: f  reason: collision with root package name */
        String f7704f;

        /* renamed from: g  reason: collision with root package name */
        int f7705g = 0;

        /* renamed from: h  reason: collision with root package name */
        int f7706h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f7707i = -16777216;

        /* renamed from: j  reason: collision with root package name */
        int f7708j = -16777216;

        /* renamed from: k  reason: collision with root package name */
        int f7709k = 0;

        /* renamed from: l  reason: collision with root package name */
        int f7710l = 0;

        /* renamed from: m  reason: collision with root package name */
        boolean f7711m;

        public a(b bVar) {
            this.f7699a = bVar;
        }

        public a a(int i10) {
            this.f7706h = i10;
            return this;
        }

        public a a(Context context) {
            this.f7706h = R.drawable.applovin_ic_disclosure_arrow;
            this.f7710l = f.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public a a(SpannedString spannedString) {
            this.f7701c = spannedString;
            return this;
        }

        public a a(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a a(boolean z10) {
            this.f7700b = z10;
            return this;
        }

        public c a() {
            return new c(this);
        }

        public a b(int i10) {
            this.f7708j = i10;
            return this;
        }

        public a b(SpannedString spannedString) {
            this.f7702d = spannedString;
            return this;
        }

        public a b(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a b(boolean z10) {
            this.f7711m = z10;
            return this;
        }

        public a c(int i10) {
            this.f7710l = i10;
            return this;
        }

        public a c(String str) {
            this.f7703e = str;
            return this;
        }

        public a d(String str) {
            this.f7704f = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);
        

        /* renamed from: g  reason: collision with root package name */
        private final int f7719g;

        b(int i10) {
            this.f7719g = i10;
        }

        public int a() {
            return this.f7719g;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.list_section_centered;
            }
            if (this == SIMPLE) {
                return 17367043;
            }
            return this == DETAIL ? R.layout.list_item_detail : R.layout.list_item_right_detail;
        }
    }

    private c(a aVar) {
        this.f7692h = 0;
        this.f7693i = 0;
        this.f7694j = -16777216;
        this.f7695k = -16777216;
        this.f7696l = 0;
        this.f7697m = 0;
        this.f7686b = aVar.f7699a;
        this.f7687c = aVar.f7700b;
        this.f7688d = aVar.f7701c;
        this.f7689e = aVar.f7702d;
        this.f7690f = aVar.f7703e;
        this.f7691g = aVar.f7704f;
        this.f7692h = aVar.f7705g;
        this.f7693i = aVar.f7706h;
        this.f7694j = aVar.f7707i;
        this.f7695k = aVar.f7708j;
        this.f7696l = aVar.f7709k;
        this.f7697m = aVar.f7710l;
        this.f7698n = aVar.f7711m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(b bVar) {
        this.f7692h = 0;
        this.f7693i = 0;
        this.f7694j = -16777216;
        this.f7695k = -16777216;
        this.f7696l = 0;
        this.f7697m = 0;
        this.f7686b = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public static int h() {
        return b.COUNT.a();
    }

    public static a p() {
        return a(b.RIGHT_DETAIL);
    }

    public boolean b() {
        return this.f7687c;
    }

    public int c() {
        return this.f7695k;
    }

    public SpannedString c_() {
        return this.f7689e;
    }

    public boolean d_() {
        return this.f7698n;
    }

    public int e() {
        return this.f7692h;
    }

    public int f() {
        return this.f7693i;
    }

    public int g() {
        return this.f7697m;
    }

    public int i() {
        return this.f7686b.a();
    }

    public int j() {
        return this.f7686b.b();
    }

    public SpannedString k() {
        return this.f7688d;
    }

    public String l() {
        return this.f7690f;
    }

    public String m() {
        return this.f7691g;
    }

    public int n() {
        return this.f7694j;
    }

    public int o() {
        return this.f7696l;
    }
}
