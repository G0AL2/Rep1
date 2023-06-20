package com.google.android.play.core.assetpacks;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h2 {

    /* renamed from: d  reason: collision with root package name */
    private static final cb.e f22857d = new cb.e("PatchSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final a0 f22858a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.d0<d3> f22859b;

    /* renamed from: c  reason: collision with root package name */
    private final bb.c f22860c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h2(a0 a0Var, cb.d0<d3> d0Var, bb.c cVar) {
        this.f22858a = a0Var;
        this.f22859b = d0Var;
        this.f22860c = cVar;
    }

    public final void a(g2 g2Var) {
        File b10 = this.f22858a.b(g2Var.f22914b, g2Var.f22842c, g2Var.f22843d);
        File file = new File(this.f22858a.j(g2Var.f22914b, g2Var.f22842c, g2Var.f22843d), g2Var.f22847h);
        try {
            InputStream inputStream = g2Var.f22849j;
            if (g2Var.f22846g == 2) {
                inputStream = new GZIPInputStream(inputStream, Constants.BUFFER_SIZE);
            }
            d0 d0Var = new d0(b10, file);
            if (this.f22860c.b()) {
                File c10 = this.f22858a.c(g2Var.f22914b, g2Var.f22844e, g2Var.f22845f, g2Var.f22847h);
                if (!c10.exists()) {
                    c10.mkdirs();
                }
                k2 k2Var = new k2(this.f22858a, g2Var.f22914b, g2Var.f22844e, g2Var.f22845f, g2Var.f22847h);
                cb.r.b(d0Var, inputStream, new v0(c10, k2Var), g2Var.f22848i);
                k2Var.j(0);
            } else {
                File file2 = new File(this.f22858a.y(g2Var.f22914b, g2Var.f22844e, g2Var.f22845f, g2Var.f22847h), "slice.zip.tmp");
                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                cb.r.b(d0Var, inputStream, new FileOutputStream(file2), g2Var.f22848i);
                if (!file2.renameTo(this.f22858a.w(g2Var.f22914b, g2Var.f22844e, g2Var.f22845f, g2Var.f22847h))) {
                    throw new s0(String.format("Error moving patch for slice %s of pack %s.", g2Var.f22847h, g2Var.f22914b), g2Var.f22913a);
                }
            }
            inputStream.close();
            if (this.f22860c.b()) {
                f22857d.f("Patching and extraction finished for slice %s of pack %s.", g2Var.f22847h, g2Var.f22914b);
            } else {
                f22857d.f("Patching finished for slice %s of pack %s.", g2Var.f22847h, g2Var.f22914b);
            }
            this.f22859b.a().b(g2Var.f22913a, g2Var.f22914b, g2Var.f22847h, 0);
            try {
                g2Var.f22849j.close();
            } catch (IOException unused) {
                f22857d.g("Could not close file for slice %s of pack %s.", g2Var.f22847h, g2Var.f22914b);
            }
        } catch (IOException e10) {
            f22857d.e("IOException during patching %s.", e10.getMessage());
            throw new s0(String.format("Error patching slice %s of pack %s.", g2Var.f22847h, g2Var.f22914b), e10, g2Var.f22913a);
        }
    }
}
