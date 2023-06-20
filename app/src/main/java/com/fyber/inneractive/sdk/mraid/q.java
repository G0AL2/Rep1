package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p0;
import java.util.Map;

/* loaded from: classes.dex */
public class q extends a {
    public q(Map<String, String> map, com.fyber.inneractive.sdk.web.d dVar, p0 p0Var) {
        super(map, dVar, p0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        String str = this.f17489b.get("uri");
        if (str != null && !"".equals(str)) {
            com.fyber.inneractive.sdk.web.d dVar = this.f17490c;
            Context g10 = dVar.g();
            if (!com.fyber.inneractive.sdk.util.k.n()) {
                dVar.a(f.STORE_PICTURE, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
                IAlog.a("Error downloading file. Please check if the Android permission is not granted, or maybe the device does not have an SD card mounted? ", new Object[0]);
                return;
            } else if (g10 instanceof Activity) {
                new AlertDialog.Builder(dVar.g()).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new com.fyber.inneractive.sdk.web.k(dVar, str)).setCancelable(true).show();
                return;
            } else {
                com.fyber.inneractive.sdk.util.n.f20310b.post(new com.fyber.inneractive.sdk.web.i(dVar, "Downloading image to Picture gallery..."));
                dVar.a(str);
                return;
            }
        }
        this.f17490c.a(f.STORE_PICTURE, "Image can't be stored with null or empty URL");
        IAlog.a("Mraid Store Picture -Invalid URI ", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public String c() {
        return this.f17489b.get("uri");
    }
}
