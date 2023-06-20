package yb;

import ac.a0;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* compiled from: SessionReportingCoordinator.java */
/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: a */
    private final n f39372a;

    /* renamed from: b */
    private final dc.e f39373b;

    /* renamed from: c */
    private final ec.c f39374c;

    /* renamed from: d */
    private final zb.c f39375d;

    /* renamed from: e */
    private final zb.g f39376e;

    c0(n nVar, dc.e eVar, ec.c cVar, zb.c cVar2, zb.g gVar) {
        this.f39372a = nVar;
        this.f39373b = eVar;
        this.f39374c = cVar;
        this.f39375d = cVar2;
        this.f39376e = gVar;
    }

    public static /* synthetic */ boolean a(c0 c0Var, Task task) {
        return c0Var.p(task);
    }

    public static /* synthetic */ int b(a0.c cVar, a0.c cVar2) {
        return m(cVar, cVar2);
    }

    private a0.e.d c(a0.e.d dVar) {
        return d(dVar, this.f39375d, this.f39376e);
    }

    private a0.e.d d(a0.e.d dVar, zb.c cVar, zb.g gVar) {
        a0.e.d.b g10 = dVar.g();
        String c10 = cVar.c();
        if (c10 != null) {
            g10.d(a0.e.d.AbstractC0022d.a().b(c10).a());
        } else {
            vb.f.f().i("No log data to include with this event.");
        }
        List<a0.c> k10 = k(gVar.a());
        List<a0.c> k11 = k(gVar.b());
        if (!k10.isEmpty() || !k11.isEmpty()) {
            g10.b(dVar.b().g().c(ac.b0.a(k10)).e(ac.b0.a(k11)).a());
        }
        return g10.a();
    }

    private static a0.a e(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = f(traceInputStream);
            }
        } catch (IOException e10) {
            vb.f f10 = vb.f.f();
            f10.k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return a0.a.a().b(applicationExitInfo.getImportance()).d(applicationExitInfo.getProcessName()).f(applicationExitInfo.getReason()).h(applicationExitInfo.getTimestamp()).c(applicationExitInfo.getPid()).e(applicationExitInfo.getPss()).g(applicationExitInfo.getRss()).i(str).a();
    }

    public static String f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Constants.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    public static c0 g(Context context, v vVar, dc.f fVar, a aVar, zb.c cVar, zb.g gVar, ic.d dVar, fc.e eVar) {
        return new c0(new n(context, vVar, aVar, dVar), new dc.e(fVar, eVar), ec.c.c(context), cVar, gVar);
    }

    private ApplicationExitInfo j(String str, List<ApplicationExitInfo> list) {
        long q10 = this.f39373b.q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < q10) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    private static List<a0.c> k(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(a0.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: yb.b0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c0.b((a0.c) obj, (a0.c) obj2);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int m(a0.c cVar, a0.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    public boolean p(Task<o> task) {
        if (task.isSuccessful()) {
            o result = task.getResult();
            vb.f f10 = vb.f.f();
            f10.b("Crashlytics report successfully enqueued to DataTransport: " + result.d());
            File c10 = result.c();
            if (c10.delete()) {
                vb.f f11 = vb.f.f();
                f11.b("Deleted report file: " + c10.getPath());
                return true;
            }
            vb.f f12 = vb.f.f();
            f12.k("Crashlytics could not delete report file: " + c10.getPath());
            return true;
        }
        vb.f.f().l("Crashlytics report could not be enqueued to DataTransport", task.getException());
        return false;
    }

    private void q(Throwable th, Thread thread, String str, String str2, long j10, boolean z10) {
        this.f39373b.y(c(this.f39372a.c(th, thread, str2, j10, 4, 8, z10)), str, str2.equals(AppMeasurement.CRASH_ORIGIN));
    }

    public void h(String str, List<y> list) {
        vb.f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (y yVar : list) {
            a0.d.b a10 = yVar.a();
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        this.f39373b.l(str, a0.d.a().b(ac.b0.a(arrayList)).a());
    }

    public void i(long j10, String str) {
        this.f39373b.k(str, j10);
    }

    public boolean l() {
        return this.f39373b.r();
    }

    public SortedSet<String> n() {
        return this.f39373b.p();
    }

    public void o(String str, long j10) {
        this.f39373b.z(this.f39372a.d(str, j10));
    }

    public void r(Throwable th, Thread thread, String str, long j10) {
        vb.f f10 = vb.f.f();
        f10.i("Persisting fatal event for session " + str);
        q(th, thread, str, AppMeasurement.CRASH_ORIGIN, j10, true);
    }

    public void s(String str, List<ApplicationExitInfo> list, zb.c cVar, zb.g gVar) {
        ApplicationExitInfo j10 = j(str, list);
        if (j10 == null) {
            vb.f f10 = vb.f.f();
            f10.i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        a0.e.d b10 = this.f39372a.b(e(j10));
        vb.f f11 = vb.f.f();
        f11.b("Persisting anr for session " + str);
        this.f39373b.y(d(b10, cVar, gVar), str, true);
    }

    public void t() {
        this.f39373b.i();
    }

    public Task<Void> u(Executor executor) {
        List<o> w10 = this.f39373b.w();
        ArrayList arrayList = new ArrayList();
        for (o oVar : w10) {
            arrayList.add(this.f39374c.g(oVar).continueWith(executor, new Continuation() { // from class: yb.a0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(c0.a(c0.this, task));
                }
            }));
        }
        return Tasks.whenAll(arrayList);
    }
}
