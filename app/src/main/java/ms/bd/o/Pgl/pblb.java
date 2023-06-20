package ms.bd.o.Pgl;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class pblb {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<pgla> f34542a = new SparseArray<>();

    /* loaded from: classes3.dex */
    public static abstract class pgla {
        public Object a(int i10, int i11, long j10, String str, Object obj) throws Throwable {
            return a(i11, j10, str, obj);
        }

        protected Object a(int i10, long j10, String str, Object obj) throws Throwable {
            return null;
        }
    }

    public static Object a(int i10) {
        return pblk.a(i10, 0, 0L, null, null);
    }

    public static Object a(int i10, int i11, long j10, String str, Object obj) {
        return pblk.a(i10, i11, j10, str, obj);
    }

    public static void a(int i10, pgla pglaVar) {
        SparseArray<pgla> sparseArray = f34542a;
        pgla pglaVar2 = sparseArray.get(i10);
        if (pglaVar2 != null) {
            throw new RuntimeException(String.format((String) pblk.a(16777217, 0, 0L, "4fa152", new byte[]{96, 119, 82, 77, 11, 33, 119, 69, 53, 100, 43, 36, 0, 64, 13, 44, 36, 83, 53, 115, 107}), pglaVar2.toString()));
        }
        sparseArray.put(i10, pglaVar);
    }

    public static Object b(int i10, int i11, long j10, String str, Object obj) {
        pgla pglaVar = f34542a.get(i10);
        if (pglaVar != null) {
            try {
                return pglaVar.a(i10, i11, j10, str, obj);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        throw new RuntimeException(String.format((String) pblk.a(16777217, 0, 0L, "0b8fa0", new byte[]{46, 112, 11, 17, 81, 35, 54, 3, 44, 50, 97, 105, 88, 82, 87, 41, 37, 66, 101, 63, 37}), Integer.valueOf(i10)));
    }

    public static Object a(int i10, long j10) {
        return pblk.a(i10, 0, j10, null, null);
    }

    public static Object a(int i10, String str) {
        return pblk.a(i10, 0, 0L, str, null);
    }
}
