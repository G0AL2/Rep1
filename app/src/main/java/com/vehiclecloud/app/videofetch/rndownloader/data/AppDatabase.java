package com.vehiclecloud.app.videofetch.rndownloader.data;

import android.content.Context;
import androidx.room.j0;
import androidx.room.k0;
import x0.b;
import z0.g;

/* loaded from: classes3.dex */
public abstract class AppDatabase extends k0 {
    private static volatile AppDatabase INSTANCE;

    public static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = (AppDatabase) j0.a(context.getApplicationContext(), AppDatabase.class, "videofetch.db").b(new b(1, 2) { // from class: com.vehiclecloud.app.videofetch.rndownloader.data.AppDatabase.1
                        @Override // x0.b
                        public void migrate(g gVar) {
                            gVar.s("ALTER TABLE DownloadResource ADD COLUMN width INTEGER NOT NULL DEFAULT 'null'");
                            gVar.s("ALTER TABLE DownloadResource ADD COLUMN height INTEGER NOT NULL DEFAULT 'null'");
                        }
                    }, new b(2, 3) { // from class: com.vehiclecloud.app.videofetch.rndownloader.data.AppDatabase.2
                        @Override // x0.b
                        public void migrate(g gVar) {
                            gVar.s("ALTER TABLE DownloadResource ADD COLUMN mergedFileName TEXT DEFAULT null");
                        }
                    }).d();
                }
            }
        }
        return INSTANCE;
    }

    public abstract DownloadResourceDao getDownloadResourceDao();
}
