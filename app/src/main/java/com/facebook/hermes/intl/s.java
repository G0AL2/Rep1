package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.d;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.util.Currency;
import java.util.Locale;

/* compiled from: PlatformNumberFormatterAndroid.java */
/* loaded from: classes.dex */
public class s implements d {

    /* renamed from: a  reason: collision with root package name */
    private Format f14752a;

    /* renamed from: b  reason: collision with root package name */
    private DecimalFormat f14753b;

    /* renamed from: c  reason: collision with root package name */
    private j f14754c;

    /* renamed from: d  reason: collision with root package name */
    private d.h f14755d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlatformNumberFormatterAndroid.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14756a;

        static {
            int[] iArr = new int[d.c.values().length];
            f14756a = iArr;
            try {
                iArr[d.c.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14756a[d.c.CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14756a[d.c.SYMBOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14756a[d.c.NARROWSYMBOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int n(String str) throws i5.d {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new i5.d("Invalid currency code !");
        }
    }

    private void o(DecimalFormat decimalFormat, com.facebook.hermes.intl.a<?> aVar, d.h hVar) {
        this.f14753b = decimalFormat;
        this.f14752a = decimalFormat;
        this.f14754c = (j) aVar;
        this.f14755d = hVar;
    }

    @Override // com.facebook.hermes.intl.d
    public String a(com.facebook.hermes.intl.a<?> aVar) {
        return "latn";
    }

    @Override // com.facebook.hermes.intl.d
    public AttributedCharacterIterator b(double d10) {
        return this.f14752a.formatToCharacterIterator(Double.valueOf(d10));
    }

    @Override // com.facebook.hermes.intl.d
    public String c(double d10) {
        return this.f14752a.format(Double.valueOf(d10));
    }

    @Override // com.facebook.hermes.intl.d
    public String l(AttributedCharacterIterator.Attribute attribute, double d10) {
        return "literal";
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: m */
    public s h(com.facebook.hermes.intl.a<?> aVar, String str, d.h hVar, d.EnumC0196d enumC0196d, d.e eVar, d.b bVar) throws i5.d {
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance((Locale) aVar.h());
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        o((DecimalFormat) numberFormat, aVar, hVar);
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: p */
    public s d(String str, d.c cVar) throws i5.d {
        if (this.f14755d == d.h.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.f14753b.setCurrency(currency);
            int i10 = a.f14756a[cVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    str = currency.getSymbol(this.f14754c.h());
                }
            } else if (Build.VERSION.SDK_INT >= 19) {
                str = currency.getDisplayName(this.f14754c.h());
            } else {
                str = currency.getSymbol(this.f14754c.h());
            }
            DecimalFormatSymbols decimalFormatSymbols = this.f14753b.getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(str);
            this.f14753b.setDecimalFormatSymbols(decimalFormatSymbols);
            this.f14753b.getDecimalFormatSymbols().setCurrencySymbol(str);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: q */
    public s i(d.f fVar, int i10, int i11) {
        if (fVar == d.f.FRACTION_DIGITS) {
            if (i10 >= 0) {
                this.f14753b.setMinimumFractionDigits(i10);
            }
            if (i11 >= 0) {
                this.f14753b.setMaximumFractionDigits(i11);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: r */
    public s g(boolean z10) {
        this.f14753b.setGroupingUsed(z10);
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: s */
    public s f(int i10) {
        if (i10 != -1) {
            this.f14753b.setMinimumIntegerDigits(i10);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: t */
    public s k(d.g gVar) {
        if (gVar == d.g.NEVER) {
            this.f14753b.setPositivePrefix("");
            this.f14753b.setPositiveSuffix("");
            this.f14753b.setNegativePrefix("");
            this.f14753b.setNegativeSuffix("");
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: u */
    public s e(d.f fVar, int i10, int i11) {
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: v */
    public s j(String str, d.i iVar) {
        return this;
    }
}
