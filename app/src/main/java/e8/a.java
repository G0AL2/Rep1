package e8;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* compiled from: AlarmManagerScheduler.java */
/* loaded from: classes2.dex */
public class a implements v {

    /* renamed from: a  reason: collision with root package name */
    private final Context f29580a;

    /* renamed from: b  reason: collision with root package name */
    private final f8.d f29581b;

    /* renamed from: c  reason: collision with root package name */
    private AlarmManager f29582c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.c f29583d;

    /* renamed from: e  reason: collision with root package name */
    private final h8.a f29584e;

    public a(Context context, f8.d dVar, h8.a aVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar) {
        this(context, dVar, (AlarmManager) context.getSystemService("alarm"), aVar, cVar);
    }

    @Override // e8.v
    public void a(w7.o oVar, int i10) {
        b(oVar, i10, false);
    }

    @Override // e8.v
    public void b(w7.o oVar, int i10, boolean z10) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", oVar.b());
        builder.appendQueryParameter("priority", String.valueOf(i8.a.a(oVar.d())));
        if (oVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(oVar.c(), 0));
        }
        Intent intent = new Intent(this.f29580a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i10);
        if (!z10 && c(intent)) {
            b8.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long V0 = this.f29581b.V0(oVar);
        long g10 = this.f29583d.g(oVar.d(), V0, i10);
        b8.a.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", oVar, Long.valueOf(g10), Long.valueOf(V0), Integer.valueOf(i10));
        this.f29582c.set(3, this.f29584e.a() + g10, PendingIntent.getBroadcast(this.f29580a, 0, intent, 0));
    }

    boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f29580a, 0, intent, 536870912) != null;
    }

    a(Context context, f8.d dVar, AlarmManager alarmManager, h8.a aVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar) {
        this.f29580a = context;
        this.f29581b = dVar;
        this.f29582c = alarmManager;
        this.f29584e = aVar;
        this.f29583d = cVar;
    }
}
