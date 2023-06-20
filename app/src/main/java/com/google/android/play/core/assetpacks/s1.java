package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class s1 implements d3 {

    /* renamed from: g  reason: collision with root package name */
    private static final cb.e f23008g = new cb.e("FakeAssetPackService");

    /* renamed from: a  reason: collision with root package name */
    private final String f23009a;

    /* renamed from: b  reason: collision with root package name */
    private final u f23010b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f23011c;

    /* renamed from: d  reason: collision with root package name */
    private final e2 f23012d;

    /* renamed from: e  reason: collision with root package name */
    private final cb.d0<Executor> f23013e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f23014f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s1(File file, u uVar, w0 w0Var, Context context, e2 e2Var, cb.d0<Executor> d0Var) {
        this.f23009a = file.getAbsolutePath();
        this.f23010b = uVar;
        this.f23011c = context;
        this.f23012d = e2Var;
        this.f23013e = d0Var;
    }

    static long c(int i10, long j10) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return j10;
            }
            return 0L;
        }
        return j10 / 2;
    }

    private static String d(File file) throws bb.a {
        try {
            return u1.a(Arrays.asList(file));
        } catch (IOException e10) {
            throw new bb.a(String.format("Could not digest file: %s.", file), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new bb.a("SHA256 algorithm not supported.", e11);
        }
    }

    private final void e(int i10, String str, int i11) throws bb.a {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f23012d.a());
        bundle.putInt("session_id", i10);
        File[] h10 = h(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j10 = 0;
        for (File file : h10) {
            j10 += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i11 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a10 = cb.q.a(file);
            bundle.putParcelableArrayList(cb.h0.b("chunk_intents", str, a10), arrayList2);
            bundle.putString(cb.h0.b("uncompressed_hash_sha256", str, a10), d(file));
            bundle.putLong(cb.h0.b("uncompressed_size", str, a10), file.length());
            arrayList.add(a10);
        }
        bundle.putStringArrayList(cb.h0.a("slice_ids", str), arrayList);
        bundle.putLong(cb.h0.a("pack_version", str), this.f23012d.a());
        bundle.putInt(cb.h0.a("status", str), i11);
        bundle.putInt(cb.h0.a("error_code", str), 0);
        bundle.putLong(cb.h0.a("bytes_downloaded", str), c(i11, j10));
        bundle.putLong(cb.h0.a("total_bytes_to_download", str), j10);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", c(i11, j10));
        bundle.putLong("total_bytes_to_download", j10);
        this.f23014f.post(new Runnable(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)) { // from class: com.google.android.play.core.assetpacks.r1

            /* renamed from: a  reason: collision with root package name */
            private final s1 f23001a;

            /* renamed from: b  reason: collision with root package name */
            private final Intent f23002b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f23001a = this;
                this.f23002b = r2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f23001a.f(this.f23002b);
            }
        });
    }

    private final File[] h(String str) throws bb.a {
        File file = new File(this.f23009a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter(str) { // from class: com.google.android.play.core.assetpacks.q1

                /* renamed from: a  reason: collision with root package name */
                private final String f22988a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f22988a = str;
                }

                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return str2.startsWith(String.valueOf(this.f22988a).concat(Constants.FILENAME_SEQUENCE_SEPARATOR)) && str2.endsWith(".apk");
                }
            });
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (cb.q.a(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new bb.a(String.format("No master slice available for pack '%s'.", str));
                }
                throw new bb.a(String.format("No APKs available for pack '%s'.", str));
            }
            throw new bb.a(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new bb.a(String.format("Local testing directory '%s' not found.", file));
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final gb.e<ParcelFileDescriptor> a(int i10, String str, String str2, int i11) {
        File[] h10;
        int i12;
        f23008g.f("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i10), str, str2, Integer.valueOf(i11));
        gb.p pVar = new gb.p();
        try {
        } catch (bb.a e10) {
            f23008g.g("getChunkFileDescriptor failed", e10);
            pVar.b(e10);
        } catch (FileNotFoundException e11) {
            f23008g.g("getChunkFileDescriptor failed", e11);
            pVar.b(new bb.a("Asset Slice file not found.", e11));
        }
        for (File file : h(str)) {
            if (cb.q.a(file).equals(str2)) {
                pVar.c(ParcelFileDescriptor.open(file, 268435456));
                return pVar.a();
            }
        }
        throw new bb.a(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final gb.e<List<String>> a(Map<String, Long> map) {
        f23008g.f("syncPacks()", new Object[0]);
        return gb.g.b(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final void a() {
        f23008g.f("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final void a(int i10) {
        f23008g.f("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final void a(int i10, String str) {
        f23008g.f("notifyModuleCompleted", new Object[0]);
        this.f23013e.a().execute(new Runnable(this, i10, str) { // from class: com.google.android.play.core.assetpacks.p1

            /* renamed from: a  reason: collision with root package name */
            private final s1 f22976a;

            /* renamed from: b  reason: collision with root package name */
            private final int f22977b;

            /* renamed from: c  reason: collision with root package name */
            private final String f22978c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f22976a = this;
                this.f22977b = i10;
                this.f22978c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f22976a.g(this.f22977b, this.f22978c);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final void a(List<String> list) {
        f23008g.f("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final void b(int i10, String str, String str2, int i11) {
        f23008g.f("notifyChunkTransferred", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(Intent intent) {
        this.f23010b.a(this.f23011c, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(int i10, String str) {
        try {
            e(i10, str, 4);
        } catch (bb.a e10) {
            f23008g.g("notifyModuleCompleted failed", e10);
        }
    }
}
