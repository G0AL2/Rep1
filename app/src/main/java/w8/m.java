package w8;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import ea.a0;
import j8.j2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p8.w;

/* compiled from: SefReader.java */
/* loaded from: classes2.dex */
final class m {

    /* renamed from: d  reason: collision with root package name */
    private static final ib.o f38438d = ib.o.d(':');

    /* renamed from: e  reason: collision with root package name */
    private static final ib.o f38439e = ib.o.d('*');

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f38440a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f38441b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f38442c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SefReader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f38443a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38444b;

        public a(int i10, long j10, int i11) {
            this.f38443a = j10;
            this.f38444b = i11;
        }
    }

    private void a(p8.j jVar, w wVar) throws IOException {
        a0 a0Var = new a0(8);
        jVar.readFully(a0Var.d(), 0, 8);
        this.f38442c = a0Var.q() + 8;
        if (a0Var.n() != 1397048916) {
            wVar.f35701a = 0L;
            return;
        }
        wVar.f35701a = jVar.getPosition() - (this.f38442c - 12);
        this.f38441b = 2;
    }

    private static int b(String str) throws j2 {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw j2.a("Invalid SEF name", null);
        }
    }

    private void d(p8.j jVar, w wVar) throws IOException {
        long b10 = jVar.b();
        int i10 = (this.f38442c - 12) - 8;
        a0 a0Var = new a0(i10);
        jVar.readFully(a0Var.d(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            a0Var.Q(2);
            short s10 = a0Var.s();
            if (s10 != 2192 && s10 != 2816 && s10 != 2817 && s10 != 2819 && s10 != 2820) {
                a0Var.Q(8);
            } else {
                this.f38440a.add(new a(s10, (b10 - this.f38442c) - a0Var.q(), a0Var.q()));
            }
        }
        if (this.f38440a.isEmpty()) {
            wVar.f35701a = 0L;
            return;
        }
        this.f38441b = 3;
        wVar.f35701a = this.f38440a.get(0).f38443a;
    }

    private void e(p8.j jVar, List<Metadata.Entry> list) throws IOException {
        long position = jVar.getPosition();
        int b10 = (int) ((jVar.b() - jVar.getPosition()) - this.f38442c);
        a0 a0Var = new a0(b10);
        jVar.readFully(a0Var.d(), 0, b10);
        for (int i10 = 0; i10 < this.f38440a.size(); i10++) {
            a aVar = this.f38440a.get(i10);
            a0Var.P((int) (aVar.f38443a - position));
            a0Var.Q(4);
            int q10 = a0Var.q();
            int b11 = b(a0Var.A(q10));
            int i11 = aVar.f38444b - (q10 + 8);
            if (b11 == 2192) {
                list.add(f(a0Var, i11));
            } else if (b11 != 2816 && b11 != 2817 && b11 != 2819 && b11 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static SlowMotionData f(a0 a0Var, int i10) throws j2 {
        ArrayList arrayList = new ArrayList();
        List<String> f10 = f38439e.f(a0Var.A(i10));
        for (int i11 = 0; i11 < f10.size(); i11++) {
            List<String> f11 = f38438d.f(f10.get(i11));
            if (f11.size() == 3) {
                try {
                    arrayList.add(new SlowMotionData.Segment(Long.parseLong(f11.get(0)), Long.parseLong(f11.get(1)), 1 << (Integer.parseInt(f11.get(2)) - 1)));
                } catch (NumberFormatException e10) {
                    throw j2.a(null, e10);
                }
            } else {
                throw j2.a(null, null);
            }
        }
        return new SlowMotionData(arrayList);
    }

    public int c(p8.j jVar, w wVar, List<Metadata.Entry> list) throws IOException {
        int i10 = this.f38441b;
        long j10 = 0;
        if (i10 == 0) {
            long b10 = jVar.b();
            if (b10 != -1 && b10 >= 8) {
                j10 = b10 - 8;
            }
            wVar.f35701a = j10;
            this.f38441b = 1;
        } else if (i10 == 1) {
            a(jVar, wVar);
        } else if (i10 == 2) {
            d(jVar, wVar);
        } else if (i10 == 3) {
            e(jVar, list);
            wVar.f35701a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public void g() {
        this.f38440a.clear();
        this.f38441b = 0;
    }
}
