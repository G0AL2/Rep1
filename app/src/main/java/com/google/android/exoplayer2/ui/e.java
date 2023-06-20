package com.google.android.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.exoplayer2.ui.e;
import ea.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import jb.t;

/* compiled from: SpannedToHtmlConverter.java */
/* loaded from: classes2.dex */
final class e {

    /* renamed from: a */
    private static final Pattern f21746a = Pattern.compile("(&#13;)?&#10;");

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        public final String f21747a;

        /* renamed from: b */
        public final Map<String, String> f21748b;

        private b(String str, Map<String, String> map) {
            this.f21747a = str;
            this.f21748b = map;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: e */
        private static final Comparator<c> f21749e = new Comparator() { // from class: com.google.android.exoplayer2.ui.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.c.a((e.c) obj, (e.c) obj2);
            }
        };

        /* renamed from: f */
        private static final Comparator<c> f21750f = new Comparator() { // from class: com.google.android.exoplayer2.ui.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.c.b((e.c) obj, (e.c) obj2);
            }
        };

        /* renamed from: a */
        public final int f21751a;

        /* renamed from: b */
        public final int f21752b;

        /* renamed from: c */
        public final String f21753c;

        /* renamed from: d */
        public final String f21754d;

        public static /* synthetic */ int a(c cVar, c cVar2) {
            return e(cVar, cVar2);
        }

        public static /* synthetic */ int b(c cVar, c cVar2) {
            return f(cVar, cVar2);
        }

        public static /* synthetic */ int e(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f21752b, cVar.f21752b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f21753c.compareTo(cVar2.f21753c);
            return compareTo != 0 ? compareTo : cVar.f21754d.compareTo(cVar2.f21754d);
        }

        public static /* synthetic */ int f(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f21751a, cVar.f21751a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f21753c.compareTo(cVar.f21753c);
            return compareTo != 0 ? compareTo : cVar2.f21754d.compareTo(cVar.f21754d);
        }

        private c(int i10, int i11, String str, String str2) {
            this.f21751a = i10;
            this.f21752b = i11;
            this.f21753c = str;
            this.f21754d = str2;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a */
        private final List<c> f21755a = new ArrayList();

        /* renamed from: b */
        private final List<c> f21756b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", t.k());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), t.k());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer num : hashSet) {
            int intValue = num.intValue();
            StringBuilder sb2 = new StringBuilder(14);
            sb2.append("bg_");
            sb2.append(intValue);
            hashMap.put(com.google.android.exoplayer2.ui.b.a(sb2.toString()), n0.C("background-color:%s;", com.google.android.exoplayer2.ui.b.b(intValue)));
        }
        SparseArray<d> c10 = c(spanned, f10);
        StringBuilder sb3 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < c10.size()) {
            int keyAt = c10.keyAt(i10);
            sb3.append(b(spanned.subSequence(i11, keyAt)));
            d dVar = c10.get(keyAt);
            Collections.sort(dVar.f21756b, c.f21750f);
            for (c cVar : dVar.f21756b) {
                sb3.append(cVar.f21754d);
            }
            Collections.sort(dVar.f21755a, c.f21749e);
            for (c cVar2 : dVar.f21755a) {
                sb3.append(cVar2.f21753c);
            }
            i10++;
            i11 = keyAt;
        }
        sb3.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb3.toString(), hashMap);
    }

    private static String b(CharSequence charSequence) {
        return f21746a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<d> c(Spanned spanned, float f10) {
        Object[] spans;
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e10 = e(obj, f10);
            String d10 = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e10 != null) {
                ea.a.e(d10);
                c cVar = new c(spanStart, spanEnd, e10, d10);
                f(sparseArray, spanStart).f21755a.add(cVar);
                f(sparseArray, spanEnd).f21756b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof v9.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof v9.e)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else if (obj instanceof v9.c) {
            String b10 = b(((v9.c) obj).f38011a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 16);
            sb2.append("<rt>");
            sb2.append(b10);
            sb2.append("</rt></ruby>");
            return sb2.toString();
        } else if (obj instanceof UnderlineSpan) {
            return "</u>";
        }
        return null;
    }

    private static String e(Object obj, float f10) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return n0.C("<span style='color:%s;'>", com.google.android.exoplayer2.ui.b.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return n0.C("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof v9.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f10;
            }
            return n0.C("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        } else if (obj instanceof RelativeSizeSpan) {
            return n0.C("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        } else {
            if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family != null) {
                    return n0.C("<span style='font-family:\"%s\";'>", family);
                }
                return null;
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style != 1) {
                    if (style != 2) {
                        if (style != 3) {
                            return null;
                        }
                        return "<b><i>";
                    }
                    return "<i>";
                }
                return "<b>";
            } else if (obj instanceof v9.c) {
                int i10 = ((v9.c) obj).f38012b;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return "<ruby style='ruby-position:under;'>";
                    }
                    return "<ruby style='ruby-position:over;'>";
                }
                return "<ruby style='ruby-position:unset;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (obj instanceof v9.e) {
                    v9.e eVar = (v9.e) obj;
                    return n0.C("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(eVar.f38013a, eVar.f38014b), g(eVar.f38015c));
                }
                return null;
            }
        }
    }

    private static d f(SparseArray<d> sparseArray, int i10) {
        d dVar = sparseArray.get(i10);
        if (dVar == null) {
            d dVar2 = new d();
            sparseArray.put(i10, dVar2);
            return dVar2;
        }
        return dVar;
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }
}
