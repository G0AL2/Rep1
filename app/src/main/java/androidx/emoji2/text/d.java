package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.g;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: n  reason: collision with root package name */
    private static final Object f2877n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private static volatile d f2878o;

    /* renamed from: b  reason: collision with root package name */
    private final Set<e> f2880b;

    /* renamed from: e  reason: collision with root package name */
    private final b f2883e;

    /* renamed from: f  reason: collision with root package name */
    final g f2884f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f2885g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f2886h;

    /* renamed from: i  reason: collision with root package name */
    final int[] f2887i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f2888j;

    /* renamed from: k  reason: collision with root package name */
    private final int f2889k;

    /* renamed from: l  reason: collision with root package name */
    private final int f2890l;

    /* renamed from: m  reason: collision with root package name */
    private final InterfaceC0057d f2891m;

    /* renamed from: a  reason: collision with root package name */
    private final ReadWriteLock f2879a = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    private volatile int f2881c = 3;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f2882d = new Handler(Looper.getMainLooper());

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    private static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private volatile androidx.emoji2.text.g f2892b;

        /* renamed from: c  reason: collision with root package name */
        private volatile l f2893c;

        /* compiled from: EmojiCompat.java */
        /* renamed from: androidx.emoji2.text.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0056a extends h {
            C0056a() {
            }

            @Override // androidx.emoji2.text.d.h
            public void a(Throwable th) {
                a.this.f2895a.m(th);
            }

            @Override // androidx.emoji2.text.d.h
            public void b(l lVar) {
                a.this.d(lVar);
            }
        }

        a(d dVar) {
            super(dVar);
        }

        @Override // androidx.emoji2.text.d.b
        void a() {
            try {
                this.f2895a.f2884f.a(new C0056a());
            } catch (Throwable th) {
                this.f2895a.m(th);
            }
        }

        @Override // androidx.emoji2.text.d.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f2892b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.d.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2893c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2895a.f2885g);
        }

        void d(l lVar) {
            if (lVar == null) {
                this.f2895a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2893c = lVar;
            l lVar2 = this.f2893c;
            i iVar = new i();
            InterfaceC0057d interfaceC0057d = this.f2895a.f2891m;
            d dVar = this.f2895a;
            this.f2892b = new androidx.emoji2.text.g(lVar2, iVar, interfaceC0057d, dVar.f2886h, dVar.f2887i);
            this.f2895a.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final d f2895a;

        b(d dVar) {
            this.f2895a = dVar;
        }

        void a() {
            this.f2895a.n();
        }

        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return charSequence;
        }

        void c(EditorInfo editorInfo) {
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final g f2896a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2897b;

        /* renamed from: c  reason: collision with root package name */
        boolean f2898c;

        /* renamed from: d  reason: collision with root package name */
        int[] f2899d;

        /* renamed from: e  reason: collision with root package name */
        Set<e> f2900e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2901f;

        /* renamed from: g  reason: collision with root package name */
        int f2902g = -16711936;

        /* renamed from: h  reason: collision with root package name */
        int f2903h = 0;

        /* renamed from: i  reason: collision with root package name */
        InterfaceC0057d f2904i = new g.b();

        /* JADX INFO: Access modifiers changed from: protected */
        public c(g gVar) {
            h0.g.g(gVar, "metadataLoader cannot be null.");
            this.f2896a = gVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final g a() {
            return this.f2896a;
        }

        public c b(int i10) {
            this.f2903h = i10;
            return this;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0057d {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final List<e> f2905a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f2906b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2907c;

        f(e eVar, int i10) {
            this(Arrays.asList((e) h0.g.g(eVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2905a.size();
            int i10 = 0;
            if (this.f2907c != 1) {
                while (i10 < size) {
                    this.f2905a.get(i10).a(this.f2906b);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                this.f2905a.get(i10).b();
                i10++;
            }
        }

        f(Collection<e> collection, int i10) {
            this(collection, i10, null);
        }

        f(Collection<e> collection, int i10, Throwable th) {
            h0.g.g(collection, "initCallbacks cannot be null");
            this.f2905a = new ArrayList(collection);
            this.f2907c = i10;
            this.f2906b = th;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(l lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class i {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.emoji2.text.h a(androidx.emoji2.text.f fVar) {
            return new n(fVar);
        }
    }

    private d(c cVar) {
        this.f2885g = cVar.f2897b;
        this.f2886h = cVar.f2898c;
        this.f2887i = cVar.f2899d;
        this.f2888j = cVar.f2901f;
        this.f2889k = cVar.f2902g;
        this.f2884f = cVar.f2896a;
        this.f2890l = cVar.f2903h;
        this.f2891m = cVar.f2904i;
        androidx.collection.b bVar = new androidx.collection.b();
        this.f2880b = bVar;
        Set<e> set = cVar.f2900e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2900e);
        }
        this.f2883e = Build.VERSION.SDK_INT < 19 ? new b(this) : new a(this);
        l();
    }

    public static d b() {
        d dVar;
        synchronized (f2877n) {
            dVar = f2878o;
            h0.g.h(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            return androidx.emoji2.text.g.c(inputConnection, editable, i10, i11, z10);
        }
        return false;
    }

    public static boolean f(Editable editable, int i10, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return androidx.emoji2.text.g.d(editable, i10, keyEvent);
        }
        return false;
    }

    public static d g(c cVar) {
        d dVar = f2878o;
        if (dVar == null) {
            synchronized (f2877n) {
                dVar = f2878o;
                if (dVar == null) {
                    dVar = new d(cVar);
                    f2878o = dVar;
                }
            }
        }
        return dVar;
    }

    public static boolean h() {
        return f2878o != null;
    }

    private boolean j() {
        return d() == 1;
    }

    private void l() {
        this.f2879a.writeLock().lock();
        try {
            if (this.f2890l == 0) {
                this.f2881c = 0;
            }
            this.f2879a.writeLock().unlock();
            if (d() == 0) {
                this.f2883e.a();
            }
        } catch (Throwable th) {
            this.f2879a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.f2889k;
    }

    public int d() {
        this.f2879a.readLock().lock();
        try {
            return this.f2881c;
        } finally {
            this.f2879a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f2888j;
    }

    public void k() {
        h0.g.h(this.f2890l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f2879a.writeLock().lock();
        try {
            if (this.f2881c == 0) {
                return;
            }
            this.f2881c = 0;
            this.f2879a.writeLock().unlock();
            this.f2883e.a();
        } finally {
            this.f2879a.writeLock().unlock();
        }
    }

    void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2879a.writeLock().lock();
        try {
            this.f2881c = 2;
            arrayList.addAll(this.f2880b);
            this.f2880b.clear();
            this.f2879a.writeLock().unlock();
            this.f2882d.post(new f(arrayList, this.f2881c, th));
        } catch (Throwable th2) {
            this.f2879a.writeLock().unlock();
            throw th2;
        }
    }

    void n() {
        ArrayList arrayList = new ArrayList();
        this.f2879a.writeLock().lock();
        try {
            this.f2881c = 1;
            arrayList.addAll(this.f2880b);
            this.f2880b.clear();
            this.f2879a.writeLock().unlock();
            this.f2882d.post(new f(arrayList, this.f2881c));
        } catch (Throwable th) {
            this.f2879a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i10, int i11) {
        return q(charSequence, i10, i11, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11, int i12) {
        return r(charSequence, i10, i11, i12, 0);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        h0.g.h(j(), "Not initialized yet");
        h0.g.d(i10, "start cannot be negative");
        h0.g.d(i11, "end cannot be negative");
        h0.g.d(i12, "maxEmojiCount cannot be negative");
        h0.g.a(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        h0.g.a(i10 <= charSequence.length(), "start should be < than charSequence length");
        h0.g.a(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f2885g : false;
        } else {
            z10 = true;
        }
        return this.f2883e.b(charSequence, i10, i11, i12, z10);
    }

    public void s(e eVar) {
        h0.g.g(eVar, "initCallback cannot be null");
        this.f2879a.writeLock().lock();
        try {
            if (this.f2881c != 1 && this.f2881c != 2) {
                this.f2880b.add(eVar);
            }
            this.f2882d.post(new f(eVar, this.f2881c));
        } finally {
            this.f2879a.writeLock().unlock();
        }
    }

    public void t(e eVar) {
        h0.g.g(eVar, "initCallback cannot be null");
        this.f2879a.writeLock().lock();
        try {
            this.f2880b.remove(eVar);
        } finally {
            this.f2879a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f2883e.c(editorInfo);
    }
}
