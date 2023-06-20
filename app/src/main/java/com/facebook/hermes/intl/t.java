package com.facebook.hermes.intl;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.d;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;

/* compiled from: PlatformNumberFormatterICU.java */
/* loaded from: classes.dex */
public class t implements d {

    /* renamed from: a  reason: collision with root package name */
    private Format f14757a;

    /* renamed from: b  reason: collision with root package name */
    private android.icu.text.NumberFormat f14758b;

    /* renamed from: c  reason: collision with root package name */
    private k f14759c;

    /* renamed from: d  reason: collision with root package name */
    private d.h f14760d;

    /* renamed from: e  reason: collision with root package name */
    private MeasureUnit f14761e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlatformNumberFormatterICU.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14762a;

        static {
            int[] iArr = new int[d.g.values().length];
            f14762a = iArr;
            try {
                iArr[d.g.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14762a[d.g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14762a[d.g.EXCEPTZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
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

    private void o(android.icu.text.NumberFormat numberFormat, com.facebook.hermes.intl.a<?> aVar, d.h hVar) {
        this.f14758b = numberFormat;
        this.f14757a = numberFormat;
        this.f14759c = (k) aVar;
        this.f14760d = hVar;
        numberFormat.setRoundingMode(4);
    }

    private static MeasureUnit p(String str) throws i5.d {
        for (MeasureUnit measureUnit : MeasureUnit.getAvailable()) {
            if (!measureUnit.getSubtype().equals(str)) {
                String subtype = measureUnit.getSubtype();
                if (subtype.equals(measureUnit.getType() + Constants.FILENAME_SEQUENCE_SEPARATOR + str)) {
                }
            }
            return measureUnit;
        }
        throw new i5.d("Unknown unit: " + str);
    }

    @Override // com.facebook.hermes.intl.d
    public String a(com.facebook.hermes.intl.a<?> aVar) throws i5.d {
        return NumberingSystem.getInstance((ULocale) aVar.h()).getName();
    }

    @Override // com.facebook.hermes.intl.d
    public AttributedCharacterIterator b(double d10) {
        try {
            try {
                Format format = this.f14757a;
                if ((format instanceof MeasureFormat) && this.f14761e != null) {
                    return format.formatToCharacterIterator(new Measure(Double.valueOf(d10), this.f14761e));
                }
                return format.formatToCharacterIterator(Double.valueOf(d10));
            } catch (NumberFormatException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d10));
            } catch (Exception unused2) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d10));
            }
        } catch (RuntimeException unused3) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d10));
        }
    }

    @Override // com.facebook.hermes.intl.d
    public String c(double d10) {
        try {
            try {
                Format format = this.f14757a;
                if ((format instanceof MeasureFormat) && this.f14761e != null) {
                    return format.format(new Measure(Double.valueOf(d10), this.f14761e));
                }
                return format.format(Double.valueOf(d10));
            } catch (RuntimeException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d10);
            }
        } catch (NumberFormatException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).format(d10);
        }
    }

    @Override // com.facebook.hermes.intl.d
    public String l(AttributedCharacterIterator.Attribute attribute, double d10) {
        return attribute == NumberFormat.Field.SIGN ? Double.compare(d10, 0.0d) >= 0 ? "plusSign" : "minusSign" : attribute == NumberFormat.Field.INTEGER ? Double.isNaN(d10) ? "nan" : Double.isInfinite(d10) ? "infinity" : "integer" : attribute == NumberFormat.Field.FRACTION ? "fraction" : attribute == NumberFormat.Field.EXPONENT ? "exponentInteger" : attribute == NumberFormat.Field.EXPONENT_SIGN ? "exponentMinusSign" : attribute == NumberFormat.Field.EXPONENT_SYMBOL ? "exponentSeparator" : attribute == NumberFormat.Field.DECIMAL_SEPARATOR ? "decimal" : attribute == NumberFormat.Field.GROUPING_SEPARATOR ? "group" : attribute == NumberFormat.Field.PERCENT ? "percentSign" : attribute == NumberFormat.Field.PERMILLE ? "permilleSign" : attribute == NumberFormat.Field.CURRENCY ? "currency" : attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: m */
    public t h(com.facebook.hermes.intl.a<?> aVar, String str, d.h hVar, d.EnumC0196d enumC0196d, d.e eVar, d.b bVar) throws i5.d {
        CompactDecimalFormat.CompactStyle compactStyle;
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(i5.c.h(str)) != null) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(i5.c.h(str));
                    aVar.f("nu", arrayList);
                } else {
                    throw new i5.d("Invalid numbering system: " + str);
                }
            } catch (RuntimeException unused) {
                throw new i5.d("Invalid numbering system: " + str);
            }
        }
        if (eVar == d.e.COMPACT && (hVar == d.h.DECIMAL || hVar == d.h.UNIT)) {
            if (bVar == d.b.SHORT) {
                compactStyle = CompactDecimalFormat.CompactStyle.SHORT;
            } else {
                compactStyle = CompactDecimalFormat.CompactStyle.LONG;
            }
            o(CompactDecimalFormat.getInstance((ULocale) aVar.h(), compactStyle), aVar, hVar);
        } else {
            android.icu.text.NumberFormat numberFormat = android.icu.text.NumberFormat.getInstance((ULocale) aVar.h(), hVar.a(eVar, enumC0196d));
            if (eVar == d.e.ENGINEERING) {
                numberFormat.setMaximumIntegerDigits(3);
            }
            o(numberFormat, aVar, hVar);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: q */
    public t d(String str, d.c cVar) throws i5.d {
        if (this.f14760d == d.h.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.f14758b.setCurrency(currency);
            if (cVar != d.c.CODE) {
                str = currency.getName(this.f14759c.h(), cVar.f(), (boolean[]) null);
            }
            android.icu.text.NumberFormat numberFormat = this.f14758b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: r */
    public t i(d.f fVar, int i10, int i11) {
        if (fVar == d.f.FRACTION_DIGITS) {
            if (i10 >= 0) {
                this.f14758b.setMinimumFractionDigits(i10);
            }
            if (i11 >= 0) {
                this.f14758b.setMaximumFractionDigits(i11);
            }
            android.icu.text.NumberFormat numberFormat = this.f14758b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: s */
    public t g(boolean z10) {
        this.f14758b.setGroupingUsed(z10);
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: t */
    public t f(int i10) {
        if (i10 != -1) {
            this.f14758b.setMinimumIntegerDigits(i10);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: u */
    public t k(d.g gVar) {
        android.icu.text.NumberFormat numberFormat = this.f14758b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            int i10 = a.f14762a[gVar.ordinal()];
            if (i10 == 1) {
                decimalFormat.setPositivePrefix("");
                decimalFormat.setPositiveSuffix("");
                decimalFormat.setNegativePrefix("");
                decimalFormat.setNegativeSuffix("");
            } else if (i10 == 2 || i10 == 3) {
                if (!decimalFormat.getNegativePrefix().isEmpty()) {
                    decimalFormat.setPositivePrefix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                }
                if (!decimalFormat.getNegativeSuffix().isEmpty()) {
                    decimalFormat.setPositiveSuffix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                }
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: v */
    public t e(d.f fVar, int i10, int i11) throws i5.d {
        android.icu.text.NumberFormat numberFormat = this.f14758b;
        if ((numberFormat instanceof DecimalFormat) && fVar == d.f.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i10 >= 0) {
                decimalFormat.setMinimumSignificantDigits(i10);
            }
            if (i11 >= 0) {
                if (i11 >= decimalFormat.getMinimumSignificantDigits()) {
                    decimalFormat.setMaximumSignificantDigits(i11);
                } else {
                    throw new i5.d("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.d
    /* renamed from: w */
    public t j(String str, d.i iVar) throws i5.d {
        if (this.f14760d == d.h.UNIT) {
            this.f14761e = p(str);
            this.f14757a = MeasureFormat.getInstance(this.f14759c.h(), iVar.f(), this.f14758b);
        }
        return this;
    }
}
