package s8;

import ea.a0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p8.h;

/* compiled from: ScriptTagPayloadReader.java */
/* loaded from: classes2.dex */
final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    private long f36813b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f36814c;

    /* renamed from: d  reason: collision with root package name */
    private long[] f36815d;

    public d() {
        super(new h());
        this.f36813b = -9223372036854775807L;
        this.f36814c = new long[0];
        this.f36815d = new long[0];
    }

    private static Boolean g(a0 a0Var) {
        return Boolean.valueOf(a0Var.D() == 1);
    }

    private static Object h(a0 a0Var, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 11) {
                                    return null;
                                }
                                return i(a0Var);
                            }
                            return m(a0Var);
                        }
                        return k(a0Var);
                    }
                    return l(a0Var);
                }
                return n(a0Var);
            }
            return g(a0Var);
        }
        return j(a0Var);
    }

    private static Date i(a0 a0Var) {
        Date date = new Date((long) j(a0Var).doubleValue());
        a0Var.Q(2);
        return date;
    }

    private static Double j(a0 a0Var) {
        return Double.valueOf(Double.longBitsToDouble(a0Var.w()));
    }

    private static HashMap<String, Object> k(a0 a0Var) {
        int H = a0Var.H();
        HashMap<String, Object> hashMap = new HashMap<>(H);
        for (int i10 = 0; i10 < H; i10++) {
            String n10 = n(a0Var);
            Object h10 = h(a0Var, o(a0Var));
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
        return hashMap;
    }

    private static HashMap<String, Object> l(a0 a0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n10 = n(a0Var);
            int o10 = o(a0Var);
            if (o10 == 9) {
                return hashMap;
            }
            Object h10 = h(a0Var, o10);
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
    }

    private static ArrayList<Object> m(a0 a0Var) {
        int H = a0Var.H();
        ArrayList<Object> arrayList = new ArrayList<>(H);
        for (int i10 = 0; i10 < H; i10++) {
            Object h10 = h(a0Var, o(a0Var));
            if (h10 != null) {
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    private static String n(a0 a0Var) {
        int J = a0Var.J();
        int e10 = a0Var.e();
        a0Var.Q(J);
        return new String(a0Var.d(), e10, J);
    }

    private static int o(a0 a0Var) {
        return a0Var.D();
    }

    @Override // s8.e
    protected boolean b(a0 a0Var) {
        return true;
    }

    @Override // s8.e
    protected boolean c(a0 a0Var, long j10) {
        if (o(a0Var) == 2 && "onMetaData".equals(n(a0Var)) && a0Var.a() != 0 && o(a0Var) == 8) {
            HashMap<String, Object> k10 = k(a0Var);
            Object obj = k10.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f36813b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = k10.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f36814c = new long[size];
                    this.f36815d = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.f36814c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.f36815d[i10] = ((Double) obj5).longValue();
                        } else {
                            this.f36814c = new long[0];
                            this.f36815d = new long[0];
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public long d() {
        return this.f36813b;
    }

    public long[] e() {
        return this.f36815d;
    }

    public long[] f() {
        return this.f36814c;
    }
}
