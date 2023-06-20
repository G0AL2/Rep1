package y0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.k0;
import ee.u;
import fe.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import qe.k;
import ve.p;
import z0.g;
import z0.j;

/* compiled from: DBUtil.kt */
/* loaded from: classes.dex */
public final class b {
    public static final void a(g gVar) {
        List c10;
        List<String> a10;
        boolean y10;
        k.f(gVar, "db");
        c10 = o.c();
        Cursor I0 = gVar.I0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        if (Build.VERSION.SDK_INT > 15) {
            while (I0.moveToNext()) {
                try {
                    c10.add(I0.getString(0));
                } finally {
                }
            }
            u uVar = u.f29813a;
            ne.a.a(I0, null);
        } else {
            while (I0.moveToNext()) {
                try {
                    c10.add(I0.getString(0));
                } finally {
                    I0.close();
                }
            }
            u uVar2 = u.f29813a;
        }
        a10 = o.a(c10);
        for (String str : a10) {
            k.e(str, "triggerName");
            y10 = p.y(str, "room_fts_content_sync_", false, 2, null);
            if (y10) {
                gVar.s("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final Cursor b(k0 k0Var, j jVar, boolean z10, CancellationSignal cancellationSignal) {
        k.f(k0Var, "db");
        k.f(jVar, "sqLiteQuery");
        Cursor query = k0Var.query(jVar, cancellationSignal);
        if (z10 && (query instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
            int count = abstractWindowedCursor.getCount();
            return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? a.a(query) : query;
        }
        return query;
    }

    public static final int c(File file) throws IOException {
        k.f(file, "databaseFile");
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i10 = allocate.getInt();
                ne.a.a(channel, null);
                return i10;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ne.a.a(channel, th);
                throw th2;
            }
        }
    }
}
