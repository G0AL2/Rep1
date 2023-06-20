package com.facebook.hermes.intl;

import com.facebook.hermes.intl.b;
import java.text.RuleBasedCollator;

/* compiled from: PlatformCollatorAndroid.java */
/* loaded from: classes.dex */
public class o implements b {

    /* renamed from: a  reason: collision with root package name */
    private RuleBasedCollator f14744a;

    /* renamed from: b  reason: collision with root package name */
    private j f14745b;

    /* compiled from: PlatformCollatorAndroid.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14746a;

        static {
            int[] iArr = new int[b.c.values().length];
            f14746a = iArr;
            try {
                iArr[b.c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14746a[b.c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14746a[b.c.VARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14746a[b.c.CASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.facebook.hermes.intl.b
    public int a(String str, String str2) {
        return this.f14744a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.b
    public b.c b() {
        RuleBasedCollator ruleBasedCollator = this.f14744a;
        if (ruleBasedCollator == null) {
            return b.c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            return b.c.BASE;
        }
        if (strength == 1) {
            return b.c.ACCENT;
        }
        return b.c.VARIANT;
    }

    @Override // com.facebook.hermes.intl.b
    public b c(boolean z10) {
        return this;
    }

    @Override // com.facebook.hermes.intl.b
    public b d(com.facebook.hermes.intl.a<?> aVar) throws i5.d {
        j jVar = (j) aVar;
        this.f14745b = jVar;
        this.f14744a = (RuleBasedCollator) RuleBasedCollator.getInstance(jVar.h());
        return this;
    }

    @Override // com.facebook.hermes.intl.b
    public b e(b.EnumC0194b enumC0194b) {
        return this;
    }

    @Override // com.facebook.hermes.intl.b
    public b f(boolean z10) {
        return this;
    }

    @Override // com.facebook.hermes.intl.b
    public b g(b.c cVar) {
        int i10 = a.f14746a[cVar.ordinal()];
        if (i10 == 1) {
            this.f14744a.setStrength(0);
        } else if (i10 == 2) {
            this.f14744a.setStrength(1);
        } else if (i10 == 3) {
            this.f14744a.setStrength(2);
        } else if (i10 == 4) {
            this.f14744a.setStrength(0);
        }
        return this;
    }
}
