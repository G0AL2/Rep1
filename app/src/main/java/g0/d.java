package g0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public class d implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    private final Spannable f30441a;

    /* renamed from: b  reason: collision with root package name */
    private final a f30442b;

    /* renamed from: c  reason: collision with root package name */
    private final PrecomputedText f30443c;

    public a a() {
        return this.f30442b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f30441a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f30441a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f30441a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f30441a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f30441a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f30443c.getSpans(i10, i11, cls);
        }
        return (T[]) this.f30441a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f30441a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f30441a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f30443c.removeSpan(obj);
                return;
            } else {
                this.f30441a.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f30443c.setSpan(obj, i10, i11, i12);
                return;
            } else {
                this.f30441a.setSpan(obj, i10, i11, i12);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f30441a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f30441a.toString();
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f30444a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f30445b;

        /* renamed from: c  reason: collision with root package name */
        private final int f30446c;

        /* renamed from: d  reason: collision with root package name */
        private final int f30447d;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: g0.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0390a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f30448a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f30449b;

            /* renamed from: c  reason: collision with root package name */
            private int f30450c;

            /* renamed from: d  reason: collision with root package name */
            private int f30451d;

            public C0390a(TextPaint textPaint) {
                this.f30448a = textPaint;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                    this.f30450c = 1;
                    this.f30451d = 1;
                } else {
                    this.f30451d = 0;
                    this.f30450c = 0;
                }
                if (i10 >= 18) {
                    this.f30449b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f30449b = null;
                }
            }

            public a a() {
                return new a(this.f30448a, this.f30449b, this.f30450c, this.f30451d);
            }

            public C0390a b(int i10) {
                this.f30450c = i10;
                return this;
            }

            public C0390a c(int i10) {
                this.f30451d = i10;
                return this;
            }

            public C0390a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f30449b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f30444a = textPaint;
            this.f30445b = textDirectionHeuristic;
            this.f30446c = i10;
            this.f30447d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 < 23 || (this.f30446c == aVar.b() && this.f30447d == aVar.c())) && this.f30444a.getTextSize() == aVar.e().getTextSize() && this.f30444a.getTextScaleX() == aVar.e().getTextScaleX() && this.f30444a.getTextSkewX() == aVar.e().getTextSkewX()) {
                if ((i10 < 21 || (this.f30444a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f30444a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) && this.f30444a.getFlags() == aVar.e().getFlags()) {
                    if (i10 >= 24) {
                        if (!this.f30444a.getTextLocales().equals(aVar.e().getTextLocales())) {
                            return false;
                        }
                    } else if (i10 >= 17 && !this.f30444a.getTextLocale().equals(aVar.e().getTextLocale())) {
                        return false;
                    }
                    return this.f30444a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f30444a.getTypeface().equals(aVar.e().getTypeface());
                }
                return false;
            }
            return false;
        }

        public int b() {
            return this.f30446c;
        }

        public int c() {
            return this.f30447d;
        }

        public TextDirectionHeuristic d() {
            return this.f30445b;
        }

        public TextPaint e() {
            return this.f30444a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (a(aVar)) {
                    return Build.VERSION.SDK_INT < 18 || this.f30445b == aVar.d();
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                return h0.c.b(Float.valueOf(this.f30444a.getTextSize()), Float.valueOf(this.f30444a.getTextScaleX()), Float.valueOf(this.f30444a.getTextSkewX()), Float.valueOf(this.f30444a.getLetterSpacing()), Integer.valueOf(this.f30444a.getFlags()), this.f30444a.getTextLocales(), this.f30444a.getTypeface(), Boolean.valueOf(this.f30444a.isElegantTextHeight()), this.f30445b, Integer.valueOf(this.f30446c), Integer.valueOf(this.f30447d));
            }
            if (i10 >= 21) {
                return h0.c.b(Float.valueOf(this.f30444a.getTextSize()), Float.valueOf(this.f30444a.getTextScaleX()), Float.valueOf(this.f30444a.getTextSkewX()), Float.valueOf(this.f30444a.getLetterSpacing()), Integer.valueOf(this.f30444a.getFlags()), this.f30444a.getTextLocale(), this.f30444a.getTypeface(), Boolean.valueOf(this.f30444a.isElegantTextHeight()), this.f30445b, Integer.valueOf(this.f30446c), Integer.valueOf(this.f30447d));
            }
            if (i10 >= 18) {
                return h0.c.b(Float.valueOf(this.f30444a.getTextSize()), Float.valueOf(this.f30444a.getTextScaleX()), Float.valueOf(this.f30444a.getTextSkewX()), Integer.valueOf(this.f30444a.getFlags()), this.f30444a.getTextLocale(), this.f30444a.getTypeface(), this.f30445b, Integer.valueOf(this.f30446c), Integer.valueOf(this.f30447d));
            }
            if (i10 >= 17) {
                return h0.c.b(Float.valueOf(this.f30444a.getTextSize()), Float.valueOf(this.f30444a.getTextScaleX()), Float.valueOf(this.f30444a.getTextSkewX()), Integer.valueOf(this.f30444a.getFlags()), this.f30444a.getTextLocale(), this.f30444a.getTypeface(), this.f30445b, Integer.valueOf(this.f30446c), Integer.valueOf(this.f30447d));
            }
            return h0.c.b(Float.valueOf(this.f30444a.getTextSize()), Float.valueOf(this.f30444a.getTextScaleX()), Float.valueOf(this.f30444a.getTextSkewX()), Integer.valueOf(this.f30444a.getFlags()), this.f30444a.getTypeface(), this.f30445b, Integer.valueOf(this.f30446c), Integer.valueOf(this.f30447d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f30444a.getTextSize());
            sb2.append(", textScaleX=" + this.f30444a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f30444a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                sb2.append(", letterSpacing=" + this.f30444a.getLetterSpacing());
                sb2.append(", elegantTextHeight=" + this.f30444a.isElegantTextHeight());
            }
            if (i10 >= 24) {
                sb2.append(", textLocale=" + this.f30444a.getTextLocales());
            } else if (i10 >= 17) {
                sb2.append(", textLocale=" + this.f30444a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f30444a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f30444a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f30445b);
            sb2.append(", breakStrategy=" + this.f30446c);
            sb2.append(", hyphenationFrequency=" + this.f30447d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f30444a = params.getTextPaint();
            this.f30445b = params.getTextDirection();
            this.f30446c = params.getBreakStrategy();
            this.f30447d = params.getHyphenationFrequency();
        }
    }
}
