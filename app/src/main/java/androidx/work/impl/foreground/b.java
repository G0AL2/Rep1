package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.g;
import androidx.work.impl.e;
import androidx.work.impl.e0;
import androidx.work.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import l1.c;
import l1.d;
import o1.m;
import o1.u;
import o1.x;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public class b implements c, e {

    /* renamed from: k  reason: collision with root package name */
    static final String f4574k = l.i("SystemFgDispatcher");

    /* renamed from: a  reason: collision with root package name */
    private Context f4575a;

    /* renamed from: b  reason: collision with root package name */
    private e0 f4576b;

    /* renamed from: c  reason: collision with root package name */
    private final q1.c f4577c;

    /* renamed from: d  reason: collision with root package name */
    final Object f4578d = new Object();

    /* renamed from: e  reason: collision with root package name */
    m f4579e;

    /* renamed from: f  reason: collision with root package name */
    final Map<m, g> f4580f;

    /* renamed from: g  reason: collision with root package name */
    final Map<m, u> f4581g;

    /* renamed from: h  reason: collision with root package name */
    final Set<u> f4582h;

    /* renamed from: i  reason: collision with root package name */
    final d f4583i;

    /* renamed from: j  reason: collision with root package name */
    private InterfaceC0085b f4584j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemForegroundDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4585a;

        a(String str) {
            this.f4585a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            u h10 = b.this.f4576b.p().h(this.f4585a);
            if (h10 == null || !h10.h()) {
                return;
            }
            synchronized (b.this.f4578d) {
                b.this.f4581g.put(x.a(h10), h10);
                b.this.f4582h.add(h10);
                b bVar = b.this;
                bVar.f4583i.a(bVar.f4582h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0085b {
        void a(int i10, Notification notification);

        void c(int i10, int i11, Notification notification);

        void d(int i10);

        void stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f4575a = context;
        e0 n10 = e0.n(context);
        this.f4576b = n10;
        this.f4577c = n10.t();
        this.f4579e = null;
        this.f4580f = new LinkedHashMap();
        this.f4582h = new HashSet();
        this.f4581g = new HashMap();
        this.f4583i = new l1.e(this.f4576b.r(), this);
        this.f4576b.p().g(this);
    }

    public static Intent c(Context context, m mVar, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent e(Context context, m mVar, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        l e10 = l.e();
        String str = f4574k;
        e10.f(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f4576b.b(UUID.fromString(stringExtra));
    }

    private void i(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        m mVar = new m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        l e10 = l.e();
        String str = f4574k;
        e10.a(str, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f4584j == null) {
            return;
        }
        this.f4580f.put(mVar, new g(intExtra, notification, intExtra2));
        if (this.f4579e == null) {
            this.f4579e = mVar;
            this.f4584j.c(intExtra, intExtra2, notification);
            return;
        }
        this.f4584j.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<m, g> entry : this.f4580f.entrySet()) {
            i10 |= entry.getValue().a();
        }
        g gVar = this.f4580f.get(this.f4579e);
        if (gVar != null) {
            this.f4584j.c(gVar.c(), i10, gVar.b());
        }
    }

    private void j(Intent intent) {
        l e10 = l.e();
        String str = f4574k;
        e10.f(str, "Started foreground service " + intent);
        this.f4577c.c(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // l1.c
    public void b(List<u> list) {
        if (list.isEmpty()) {
            return;
        }
        for (u uVar : list) {
            String str = uVar.f34905a;
            l e10 = l.e();
            String str2 = f4574k;
            e10.a(str2, "Constraints unmet for WorkSpec " + str);
            this.f4576b.A(x.a(uVar));
        }
    }

    @Override // androidx.work.impl.e
    public void d(m mVar, boolean z10) {
        Map.Entry<m, g> entry;
        synchronized (this.f4578d) {
            u remove = this.f4581g.remove(mVar);
            if (remove != null ? this.f4582h.remove(remove) : false) {
                this.f4583i.a(this.f4582h);
            }
        }
        g remove2 = this.f4580f.remove(mVar);
        if (mVar.equals(this.f4579e) && this.f4580f.size() > 0) {
            Iterator<Map.Entry<m, g>> it = this.f4580f.entrySet().iterator();
            Map.Entry<m, g> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f4579e = entry.getKey();
            if (this.f4584j != null) {
                g value = entry.getValue();
                this.f4584j.c(value.c(), value.a(), value.b());
                this.f4584j.d(value.c());
            }
        }
        InterfaceC0085b interfaceC0085b = this.f4584j;
        if (remove2 == null || interfaceC0085b == null) {
            return;
        }
        l e10 = l.e();
        String str = f4574k;
        e10.a(str, "Removing Notification (id: " + remove2.c() + ", workSpecId: " + mVar + ", notificationType: " + remove2.a());
        interfaceC0085b.d(remove2.c());
    }

    @Override // l1.c
    public void f(List<u> list) {
    }

    void k(Intent intent) {
        l.e().f(f4574k, "Stopping foreground service");
        InterfaceC0085b interfaceC0085b = this.f4584j;
        if (interfaceC0085b != null) {
            interfaceC0085b.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        this.f4584j = null;
        synchronized (this.f4578d) {
            this.f4583i.reset();
        }
        this.f4576b.p().n(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(InterfaceC0085b interfaceC0085b) {
        if (this.f4584j != null) {
            l.e().c(f4574k, "A callback already exists.");
        } else {
            this.f4584j = interfaceC0085b;
        }
    }
}
