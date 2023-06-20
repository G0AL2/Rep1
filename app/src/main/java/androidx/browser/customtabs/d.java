package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f1796a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f1797b;

    d(Intent intent, Bundle bundle) {
        this.f1796a = intent;
        this.f1797b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1796a.setData(uri);
        androidx.core.content.b.k(context, this.f1796a, this.f1797b);
    }

    /* compiled from: CustomTabsIntent.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<Bundle> f1800c;

        /* renamed from: d  reason: collision with root package name */
        private Bundle f1801d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<Bundle> f1802e;

        /* renamed from: f  reason: collision with root package name */
        private SparseArray<Bundle> f1803f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f1804g;

        /* renamed from: a  reason: collision with root package name */
        private final Intent f1798a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        private final a.C0038a f1799b = new a.C0038a();

        /* renamed from: h  reason: collision with root package name */
        private int f1805h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1806i = true;

        public a() {
        }

        private void d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            androidx.core.app.e.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1798a.putExtras(bundle);
        }

        public d a() {
            if (!this.f1798a.hasExtra("android.support.customtabs.extra.SESSION")) {
                d(null, null);
            }
            ArrayList<Bundle> arrayList = this.f1800c;
            if (arrayList != null) {
                this.f1798a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1802e;
            if (arrayList2 != null) {
                this.f1798a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1798a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1806i);
            this.f1798a.putExtras(this.f1799b.a().a());
            Bundle bundle = this.f1804g;
            if (bundle != null) {
                this.f1798a.putExtras(bundle);
            }
            if (this.f1803f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1803f);
                this.f1798a.putExtras(bundle2);
            }
            this.f1798a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1805h);
            return new d(this.f1798a, this.f1801d);
        }

        @Deprecated
        public a b() {
            this.f1798a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            return this;
        }

        public a c(f fVar) {
            this.f1798a.setPackage(fVar.b().getPackageName());
            d(fVar.a(), fVar.c());
            return this;
        }

        public a(f fVar) {
            if (fVar != null) {
                c(fVar);
            }
        }
    }
}
