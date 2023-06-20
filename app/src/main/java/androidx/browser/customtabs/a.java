package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: CustomTabColorSchemeParams.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f1767a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f1768b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f1769c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f1770d;

    /* compiled from: CustomTabColorSchemeParams.java */
    /* renamed from: androidx.browser.customtabs.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0038a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f1771a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f1772b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f1773c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f1774d;

        public a a() {
            return new a(this.f1771a, this.f1772b, this.f1773c, this.f1774d);
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1767a = num;
        this.f1768b = num2;
        this.f1769c = num3;
        this.f1770d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1767a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1768b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1769c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1770d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
