package o1;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.k0;
import androidx.room.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import o1.u;

/* compiled from: RawWorkInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f34881a;

    /* compiled from: RawWorkInfoDao_Impl.java */
    /* loaded from: classes.dex */
    class a implements Callable<List<u.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z0.j f34882a;

        a(z0.j jVar) {
            this.f34882a = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0052, B:11:0x005e, B:12:0x0067, B:13:0x007e, B:38:0x00d1, B:40:0x00dd, B:41:0x00e2, B:43:0x00f0, B:44:0x00f5, B:37:0x00cb, B:34:0x00c0, B:26:0x00a8, B:30:0x00b4, B:29:0x00b0, B:23:0x0098, B:17:0x0088, B:20:0x008f), top: B:51:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a8 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0052, B:11:0x005e, B:12:0x0067, B:13:0x007e, B:38:0x00d1, B:40:0x00dd, B:41:0x00e2, B:43:0x00f0, B:44:0x00f5, B:37:0x00cb, B:34:0x00c0, B:26:0x00a8, B:30:0x00b4, B:29:0x00b0, B:23:0x0098, B:17:0x0088, B:20:0x008f), top: B:51:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c0 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0052, B:11:0x005e, B:12:0x0067, B:13:0x007e, B:38:0x00d1, B:40:0x00dd, B:41:0x00e2, B:43:0x00f0, B:44:0x00f5, B:37:0x00cb, B:34:0x00c0, B:26:0x00a8, B:30:0x00b4, B:29:0x00b0, B:23:0x0098, B:17:0x0088, B:20:0x008f), top: B:51:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0052, B:11:0x005e, B:12:0x0067, B:13:0x007e, B:38:0x00d1, B:40:0x00dd, B:41:0x00e2, B:43:0x00f0, B:44:0x00f5, B:37:0x00cb, B:34:0x00c0, B:26:0x00a8, B:30:0x00b4, B:29:0x00b0, B:23:0x0098, B:17:0x0088, B:20:0x008f), top: B:51:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00dd A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0052, B:11:0x005e, B:12:0x0067, B:13:0x007e, B:38:0x00d1, B:40:0x00dd, B:41:0x00e2, B:43:0x00f0, B:44:0x00f5, B:37:0x00cb, B:34:0x00c0, B:26:0x00a8, B:30:0x00b4, B:29:0x00b0, B:23:0x0098, B:17:0x0088, B:20:0x008f), top: B:51:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00f0 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0052, B:11:0x005e, B:12:0x0067, B:13:0x007e, B:38:0x00d1, B:40:0x00dd, B:41:0x00e2, B:43:0x00f0, B:44:0x00f5, B:37:0x00cb, B:34:0x00c0, B:26:0x00a8, B:30:0x00b4, B:29:0x00b0, B:23:0x0098, B:17:0x0088, B:20:0x008f), top: B:51:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00f5 A[SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.List<o1.u.c> call() throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o1.h.a.call():java.util.List");
        }
    }

    public h(k0 k0Var) {
        this.f34881a = k0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(androidx.collection.a<String, ArrayList<androidx.work.e>> aVar) {
        int i10;
        Set<String> keySet = aVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>((int) k0.MAX_BIND_PARAMETER_CNT);
            int size = aVar.size();
            int i11 = 0;
            loop0: while (true) {
                i10 = 0;
                while (i11 < size) {
                    aVar2.put(aVar.j(i11), aVar.n(i11));
                    i11++;
                    i10++;
                    if (i10 == 999) {
                        break;
                    }
                }
                b(aVar2);
                aVar2 = new androidx.collection.a<>((int) k0.MAX_BIND_PARAMETER_CNT);
            }
            if (i10 > 0) {
                b(aVar2);
                return;
            }
            return;
        }
        StringBuilder b10 = y0.d.b();
        b10.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        y0.d.a(b10, size2);
        b10.append(")");
        n0 d10 = n0.d(b10.toString(), size2 + 0);
        int i12 = 1;
        for (String str : keySet) {
            if (str == null) {
                d10.P0(i12);
            } else {
                d10.p0(i12, str);
            }
            i12++;
        }
        Cursor b11 = y0.b.b(this.f34881a, d10, false, null);
        try {
            int d11 = y0.a.d(b11, "work_spec_id");
            if (d11 == -1) {
                return;
            }
            while (b11.moveToNext()) {
                ArrayList<androidx.work.e> arrayList = aVar.get(b11.getString(d11));
                if (arrayList != null) {
                    arrayList.add(androidx.work.e.g(b11.isNull(0) ? null : b11.getBlob(0)));
                }
            }
        } finally {
            b11.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(androidx.collection.a<String, ArrayList<String>> aVar) {
        int i10;
        Set<String> keySet = aVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<String>> aVar2 = new androidx.collection.a<>((int) k0.MAX_BIND_PARAMETER_CNT);
            int size = aVar.size();
            int i11 = 0;
            loop0: while (true) {
                i10 = 0;
                while (i11 < size) {
                    aVar2.put(aVar.j(i11), aVar.n(i11));
                    i11++;
                    i10++;
                    if (i10 == 999) {
                        break;
                    }
                }
                c(aVar2);
                aVar2 = new androidx.collection.a<>((int) k0.MAX_BIND_PARAMETER_CNT);
            }
            if (i10 > 0) {
                c(aVar2);
                return;
            }
            return;
        }
        StringBuilder b10 = y0.d.b();
        b10.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        y0.d.a(b10, size2);
        b10.append(")");
        n0 d10 = n0.d(b10.toString(), size2 + 0);
        int i12 = 1;
        for (String str : keySet) {
            if (str == null) {
                d10.P0(i12);
            } else {
                d10.p0(i12, str);
            }
            i12++;
        }
        Cursor b11 = y0.b.b(this.f34881a, d10, false, null);
        try {
            int d11 = y0.a.d(b11, "work_spec_id");
            if (d11 == -1) {
                return;
            }
            while (b11.moveToNext()) {
                ArrayList<String> arrayList = aVar.get(b11.getString(d11));
                if (arrayList != null) {
                    arrayList.add(b11.isNull(0) ? null : b11.getString(0));
                }
            }
        } finally {
            b11.close();
        }
    }

    public static List<Class<?>> g() {
        return Collections.emptyList();
    }

    @Override // o1.g
    public LiveData<List<u.c>> a(z0.j jVar) {
        return this.f34881a.getInvalidationTracker().d(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new a(jVar));
    }
}
