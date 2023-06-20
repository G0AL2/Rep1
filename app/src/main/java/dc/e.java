package dc;

import ac.a0;
import ac.b0;
import bc.g;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import yb.o;

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: d */
    private static final Charset f29341d = Charset.forName("UTF-8");

    /* renamed from: e */
    private static final int f29342e = 15;

    /* renamed from: f */
    private static final g f29343f = new g();

    /* renamed from: g */
    private static final Comparator<? super File> f29344g = new Comparator() { // from class: dc.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.a((File) obj, (File) obj2);
        }
    };

    /* renamed from: h */
    private static final FilenameFilter f29345h = new FilenameFilter() { // from class: dc.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return e.d(file, str);
        }
    };

    /* renamed from: a */
    private final AtomicInteger f29346a = new AtomicInteger(0);

    /* renamed from: b */
    private final f f29347b;

    /* renamed from: c */
    private final fc.e f29348c;

    public e(f fVar, fc.e eVar) {
        this.f29347b = fVar;
        this.f29348c = eVar;
    }

    private static String A(File file) throws IOException {
        byte[] bArr = new byte[Constants.BUFFER_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f29341d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void B(File file, a0.d dVar, String str) {
        try {
            g gVar = f29343f;
            F(this.f29347b.f(str), gVar.E(gVar.D(A(file)).m(dVar)));
        } catch (IOException e10) {
            vb.f f10 = vb.f.f();
            f10.l("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void C(String str, long j10) {
        boolean z10;
        List<File> o10 = this.f29347b.o(str, f29345h);
        if (o10.isEmpty()) {
            vb.f f10 = vb.f.f();
            f10.i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(o10);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : o10) {
                try {
                    arrayList.add(f29343f.g(A(file)));
                } catch (IOException e10) {
                    vb.f f11 = vb.f.f();
                    f11.l("Could not add event to report for " + file, e10);
                }
                if (z10 || s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            vb.f f12 = vb.f.f();
            f12.k("Could not parse event files for session " + str);
            return;
        }
        D(this.f29347b.n(str, "report"), arrayList, j10, z10, zb.g.d(str, this.f29347b));
    }

    private void D(File file, List<a0.e.d> list, long j10, boolean z10, String str) {
        File k10;
        try {
            g gVar = f29343f;
            a0 l10 = gVar.D(A(file)).n(j10, z10, str).l(b0.a(list));
            a0.e j11 = l10.j();
            if (j11 == null) {
                return;
            }
            if (z10) {
                k10 = this.f29347b.i(j11.h());
            } else {
                k10 = this.f29347b.k(j11.h());
            }
            F(k10, gVar.E(l10));
        } catch (IOException e10) {
            vb.f f10 = vb.f.f();
            f10.l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int E(String str, int i10) {
        List<File> o10 = this.f29347b.o(str, new FilenameFilter() { // from class: dc.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.b(file, str2);
            }
        });
        Collections.sort(o10, new Comparator() { // from class: dc.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.c((File) obj, (File) obj2);
            }
        });
        return f(o10, i10);
    }

    private static void F(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f29341d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void G(File file, String str, long j10) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f29341d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static /* synthetic */ int a(File file, File file2) {
        return u(file, file2);
    }

    public static /* synthetic */ boolean b(File file, String str) {
        return t(file, str);
    }

    public static /* synthetic */ int c(File file, File file2) {
        return x(file, file2);
    }

    public static /* synthetic */ boolean d(File file, String str) {
        return v(file, str);
    }

    private SortedSet<String> e(String str) {
        this.f29347b.a();
        SortedSet<String> p10 = p();
        if (str != null) {
            p10.remove(str);
        }
        if (p10.size() <= 8) {
            return p10;
        }
        while (p10.size() > 8) {
            String last = p10.last();
            vb.f f10 = vb.f.f();
            f10.b("Removing session over cap: " + last);
            this.f29347b.b(last);
            p10.remove(last);
        }
        return p10;
    }

    private static int f(List<File> list, int i10) {
        int size = list.size();
        for (File file : list) {
            if (size <= i10) {
                return size;
            }
            f.r(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i10 = this.f29348c.a().b().f30817b;
        List<File> n10 = n();
        int size = n10.size();
        if (size <= i10) {
            return;
        }
        for (File file : n10.subList(i10, size)) {
            file.delete();
        }
    }

    private static long h(long j10) {
        return j10 * 1000;
    }

    private void j(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    private static String m(int i10, boolean z10) {
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i10));
        String str = z10 ? "_" : "";
        return "event" + format + str;
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f29347b.j());
        arrayList.addAll(this.f29347b.g());
        Comparator<? super File> comparator = f29344g;
        Collections.sort(arrayList, comparator);
        List<File> l10 = this.f29347b.l();
        Collections.sort(l10, comparator);
        arrayList.addAll(l10);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f29342e);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f29347b.l());
        j(this.f29347b.j());
        j(this.f29347b.g());
    }

    public void k(String str, long j10) {
        for (String str2 : e(str)) {
            vb.f f10 = vb.f.f();
            f10.i("Finalizing report for session " + str2);
            C(str2, j10);
            this.f29347b.b(str2);
        }
        g();
    }

    public void l(String str, a0.d dVar) {
        File n10 = this.f29347b.n(str, "report");
        vb.f f10 = vb.f.f();
        f10.b("Writing native session report for " + str + " to file: " + n10);
        B(n10, dVar, str);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f29347b.c()).descendingSet();
    }

    public long q(String str) {
        return this.f29347b.n(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f29347b.l().isEmpty() && this.f29347b.j().isEmpty() && this.f29347b.g().isEmpty()) ? false : true;
    }

    public List<o> w() {
        List<File> n10 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n10) {
            try {
                arrayList.add(o.a(f29343f.D(A(file)), file.getName(), file));
            } catch (IOException e10) {
                vb.f f10 = vb.f.f();
                f10.l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(a0.e.d dVar, String str, boolean z10) {
        int i10 = this.f29348c.a().b().f30816a;
        try {
            F(this.f29347b.n(str, m(this.f29346a.getAndIncrement(), z10)), f29343f.h(dVar));
        } catch (IOException e10) {
            vb.f f10 = vb.f.f();
            f10.l("Could not persist event for session " + str, e10);
        }
        E(str, i10);
    }

    public void z(a0 a0Var) {
        a0.e j10 = a0Var.j();
        if (j10 == null) {
            vb.f.f().b("Could not get session for report");
            return;
        }
        String h10 = j10.h();
        try {
            F(this.f29347b.n(h10, "report"), f29343f.E(a0Var));
            G(this.f29347b.n(h10, "start-time"), "", j10.k());
        } catch (IOException e10) {
            vb.f f10 = vb.f.f();
            f10.c("Could not persist report for session " + h10, e10);
        }
    }
}
