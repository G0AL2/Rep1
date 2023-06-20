package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;
import com.facebook.hermes.intl.b;

/* compiled from: PlatformCollatorICU.java */
/* loaded from: classes.dex */
public class p implements b {

    /* renamed from: a  reason: collision with root package name */
    private RuleBasedCollator f14747a = null;

    /* compiled from: PlatformCollatorICU.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14748a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f14749b;

        static {
            int[] iArr = new int[b.EnumC0194b.values().length];
            f14749b = iArr;
            try {
                iArr[b.EnumC0194b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14749b[b.EnumC0194b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14749b[b.EnumC0194b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.c.values().length];
            f14748a = iArr2;
            try {
                iArr2[b.c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14748a[b.c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14748a[b.c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14748a[b.c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.facebook.hermes.intl.b
    public int a(String str, String str2) {
        return this.f14747a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.b
    public b.c b() {
        RuleBasedCollator ruleBasedCollator = this.f14747a;
        if (ruleBasedCollator == null) {
            return b.c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            return this.f14747a.isCaseLevel() ? b.c.CASE : b.c.BASE;
        } else if (strength == 1) {
            return b.c.ACCENT;
        } else {
            return b.c.VARIANT;
        }
    }

    @Override // com.facebook.hermes.intl.b
    public b c(boolean z10) {
        if (z10) {
            this.f14747a.setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.b
    public b d(com.facebook.hermes.intl.a<?> aVar) throws i5.d {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) RuleBasedCollator.getInstance(((k) aVar).h());
        this.f14747a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.b
    public b e(b.EnumC0194b enumC0194b) {
        int i10 = a.f14749b[enumC0194b.ordinal()];
        if (i10 == 1) {
            this.f14747a.setUpperCaseFirst(true);
        } else if (i10 != 2) {
            this.f14747a.setCaseFirstDefault();
        } else {
            this.f14747a.setLowerCaseFirst(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.b
    public b f(boolean z10) {
        if (z10) {
            this.f14747a.setNumericCollation(i5.c.e(Boolean.TRUE));
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.b
    public b g(b.c cVar) {
        int i10 = a.f14748a[cVar.ordinal()];
        if (i10 == 1) {
            this.f14747a.setStrength(0);
        } else if (i10 == 2) {
            this.f14747a.setStrength(1);
        } else if (i10 == 3) {
            this.f14747a.setStrength(0);
            this.f14747a.setCaseLevel(true);
        } else if (i10 == 4) {
            this.f14747a.setStrength(2);
        }
        return this;
    }
}
