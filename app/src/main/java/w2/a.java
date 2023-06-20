package w2;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: MediaCacheDirImpl.java */
/* loaded from: classes.dex */
public class a implements j3.a {

    /* renamed from: a  reason: collision with root package name */
    private String f38163a = "video_feed";

    /* renamed from: b  reason: collision with root package name */
    private String f38164b = "video_reward_full";

    /* renamed from: c  reason: collision with root package name */
    private String f38165c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f38166d = null;

    /* renamed from: e  reason: collision with root package name */
    private String f38167e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediaCacheDirImpl.java */
    /* renamed from: w2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0524a implements Comparator<File> {
        C0524a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            int i10 = ((file2.lastModified() - file.lastModified()) > 0L ? 1 : ((file2.lastModified() - file.lastModified()) == 0L ? 0 : -1));
            if (i10 == 0) {
                return 0;
            }
            return i10 < 0 ? -1 : 1;
        }
    }

    @Override // j3.a
    public void a(String str) {
        this.f38165c = str;
    }

    @Override // j3.a
    public String b() {
        if (this.f38167e == null) {
            this.f38167e = this.f38165c + File.separator + this.f38164b;
            File file = new File(this.f38167e);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f38167e;
    }

    @Override // j3.a
    public void c() {
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 23) {
            for (v2.a aVar : v2.a.f37766e.values()) {
                if (aVar != null && aVar.a() != null) {
                    l3.c a10 = aVar.a();
                    hashSet.add(h3.c.c(a10.a(), a10.A()).getAbsolutePath());
                }
            }
            for (x2.b bVar : x2.c.f38686a.values()) {
                if (bVar != null && bVar.a() != null) {
                    l3.c a11 = bVar.a();
                    hashSet.add(h3.c.c(a11.a(), a11.A()).getAbsolutePath());
                }
            }
        }
        b(new File(a()), 30, hashSet);
        b(new File(b()), 20, hashSet);
    }

    @Override // j3.a
    public String a() {
        if (this.f38166d == null) {
            this.f38166d = this.f38165c + File.separator + this.f38163a;
            File file = new File(this.f38166d);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f38166d;
    }

    @Override // j3.a
    public long b(l3.c cVar) {
        if (TextUtils.isEmpty(cVar.a()) || TextUtils.isEmpty(cVar.A())) {
            return 0L;
        }
        return h3.c.a(cVar.a(), cVar.A());
    }

    @Override // j3.a
    public boolean a(l3.c cVar) {
        if (TextUtils.isEmpty(cVar.a()) || TextUtils.isEmpty(cVar.A())) {
            return false;
        }
        return new File(cVar.a(), cVar.A()).exists();
    }

    private static void b(File file, int i10, Set<String> set) {
        if (i10 >= 0 && file.exists() && !file.isFile()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length <= i10) {
                    return;
                }
                List asList = Arrays.asList(listFiles);
                Collections.sort(asList, new C0524a());
                while (i10 < asList.size()) {
                    File file2 = (File) asList.get(i10);
                    if (set != null && !set.contains(file2.getAbsolutePath())) {
                        ((File) asList.get(i10)).delete();
                    }
                    i10++;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
