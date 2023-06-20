package androidx.browser.customtabs;

import a.a;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final a.b f1775a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f1776b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1777c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomTabsClient.java */
    /* loaded from: classes.dex */
    public class a extends a.AbstractBinderC0000a {

        /* renamed from: a  reason: collision with root package name */
        private Handler f1778a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f1779b;

        /* compiled from: CustomTabsClient.java */
        /* renamed from: androidx.browser.customtabs.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0039a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1780a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f1781b;

            RunnableC0039a(int i10, Bundle bundle) {
                this.f1780a = i10;
                this.f1781b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1779b.onNavigationEvent(this.f1780a, this.f1781b);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f1783a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f1784b;

            b(String str, Bundle bundle) {
                this.f1783a = str;
                this.f1784b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1779b.extraCallback(this.f1783a, this.f1784b);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: androidx.browser.customtabs.c$a$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0040c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Bundle f1786a;

            RunnableC0040c(Bundle bundle) {
                this.f1786a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1779b.onMessageChannelReady(this.f1786a);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f1788a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f1789b;

            d(String str, Bundle bundle) {
                this.f1788a = str;
                this.f1789b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1779b.onPostMessage(this.f1788a, this.f1789b);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: classes.dex */
        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1791a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Uri f1792b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f1793c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Bundle f1794d;

            e(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f1791a = i10;
                this.f1792b = uri;
                this.f1793c = z10;
                this.f1794d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1779b.onRelationshipValidationResult(this.f1791a, this.f1792b, this.f1793c, this.f1794d);
            }
        }

        a(c cVar, androidx.browser.customtabs.b bVar) {
            this.f1779b = bVar;
        }

        @Override // a.a
        public void O(int i10, Bundle bundle) {
            if (this.f1779b == null) {
                return;
            }
            this.f1778a.post(new RunnableC0039a(i10, bundle));
        }

        @Override // a.a
        public void Q(String str, Bundle bundle) throws RemoteException {
            if (this.f1779b == null) {
                return;
            }
            this.f1778a.post(new d(str, bundle));
        }

        @Override // a.a
        public void S(Bundle bundle) throws RemoteException {
            if (this.f1779b == null) {
                return;
            }
            this.f1778a.post(new RunnableC0040c(bundle));
        }

        @Override // a.a
        public void U(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
            if (this.f1779b == null) {
                return;
            }
            this.f1778a.post(new e(i10, uri, z10, bundle));
        }

        @Override // a.a
        public Bundle e(String str, Bundle bundle) throws RemoteException {
            androidx.browser.customtabs.b bVar = this.f1779b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        @Override // a.a
        public void j(String str, Bundle bundle) throws RemoteException {
            if (this.f1779b == null) {
                return;
            }
            this.f1778a.post(new b(str, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a.b bVar, ComponentName componentName, Context context) {
        this.f1775a = bVar;
        this.f1776b = componentName;
        this.f1777c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private a.AbstractBinderC0000a b(b bVar) {
        return new a(this, bVar);
    }

    private f d(b bVar, PendingIntent pendingIntent) {
        boolean E;
        a.AbstractBinderC0000a b10 = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                E = this.f1775a.I(b10, bundle);
            } else {
                E = this.f1775a.E(b10);
            }
            if (E) {
                return new f(this.f1775a, b10, this.f1776b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f c(b bVar) {
        return d(bVar, null);
    }

    public boolean e(long j10) {
        try {
            return this.f1775a.H(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
