package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.k0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;

/* compiled from: SQLiteCopyOpenHelper.kt */
/* loaded from: classes.dex */
public final class r0 implements z0.h, g {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4034a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4035b;

    /* renamed from: c  reason: collision with root package name */
    private final File f4036c;

    /* renamed from: d  reason: collision with root package name */
    private final Callable<InputStream> f4037d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4038e;

    /* renamed from: f  reason: collision with root package name */
    private final z0.h f4039f;

    /* renamed from: g  reason: collision with root package name */
    private f f4040g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4041h;

    public r0(Context context, String str, File file, Callable<InputStream> callable, int i10, z0.h hVar) {
        qe.k.f(context, "context");
        qe.k.f(hVar, "delegate");
        this.f4034a = context;
        this.f4035b = str;
        this.f4036c = file;
        this.f4037d = callable;
        this.f4038e = i10;
        this.f4039f = hVar;
    }

    private final void b(File file, boolean z10) throws IOException {
        ReadableByteChannel newChannel;
        if (this.f4035b != null) {
            newChannel = Channels.newChannel(this.f4034a.getAssets().open(this.f4035b));
            qe.k.e(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f4036c != null) {
            newChannel = new FileInputStream(this.f4036c).getChannel();
            qe.k.e(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.f4037d;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel(callable.call());
                    qe.k.e(newChannel, "newChannel(inputStream)");
                } catch (Exception e10) {
                    throw new IOException("inputStreamCallable exception on call", e10);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f4034a.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        qe.k.e(channel, "output");
        y0.c.a(newChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        qe.k.e(createTempFile, "intermediateFile");
        d(createTempFile, z10);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void d(File file, boolean z10) {
        f fVar = this.f4040g;
        if (fVar == null) {
            qe.k.s("databaseConfiguration");
            fVar = null;
        }
        k0.f fVar2 = fVar.f3904n;
    }

    private final void h(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databasePath = this.f4034a.getDatabasePath(databaseName);
            f fVar = this.f4040g;
            f fVar2 = null;
            if (fVar == null) {
                qe.k.s("databaseConfiguration");
                fVar = null;
            }
            boolean z11 = fVar.f3907q;
            File filesDir = this.f4034a.getFilesDir();
            qe.k.e(filesDir, "context.filesDir");
            b1.a aVar = new b1.a(databaseName, filesDir, z11);
            try {
                b1.a.c(aVar, false, 1, null);
                if (!databasePath.exists()) {
                    try {
                        qe.k.e(databasePath, "databaseFile");
                        b(databasePath, z10);
                        aVar.d();
                        return;
                    } catch (IOException e10) {
                        throw new RuntimeException("Unable to copy database file.", e10);
                    }
                }
                try {
                    qe.k.e(databasePath, "databaseFile");
                    int c10 = y0.b.c(databasePath);
                    if (c10 == this.f4038e) {
                        aVar.d();
                        return;
                    }
                    f fVar3 = this.f4040g;
                    if (fVar3 == null) {
                        qe.k.s("databaseConfiguration");
                    } else {
                        fVar2 = fVar3;
                    }
                    if (fVar2.a(c10, this.f4038e)) {
                        aVar.d();
                        return;
                    }
                    if (this.f4034a.deleteDatabase(databaseName)) {
                        try {
                            b(databasePath, z10);
                        } catch (IOException e11) {
                            Log.w("ROOM", "Unable to copy database file.", e11);
                        }
                    } else {
                        Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                    }
                    aVar.d();
                    return;
                } catch (IOException e12) {
                    Log.w("ROOM", "Unable to read database version.", e12);
                    aVar.d();
                    return;
                }
            } catch (Throwable th) {
                aVar.d();
                throw th;
            }
            aVar.d();
            throw th;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // z0.h
    public z0.g F0() {
        if (!this.f4041h) {
            h(true);
            this.f4041h = true;
        }
        return a().F0();
    }

    @Override // androidx.room.g
    public z0.h a() {
        return this.f4039f;
    }

    @Override // z0.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a().close();
        this.f4041h = false;
    }

    public final void e(f fVar) {
        qe.k.f(fVar, "databaseConfiguration");
        this.f4040g = fVar;
    }

    @Override // z0.h
    public String getDatabaseName() {
        return a().getDatabaseName();
    }

    @Override // z0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        a().setWriteAheadLoggingEnabled(z10);
    }
}
