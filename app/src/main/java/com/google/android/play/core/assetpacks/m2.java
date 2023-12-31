package com.google.android.play.core.assetpacks;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class m2 {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f22915a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<File> a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(l2.f22911a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[listFiles.length];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split(Constants.FILENAME_SEQUENCE_SEPARATOR)[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new s0("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    q2 b10 = new j0(fileInputStream).b();
                    if (b10.d() == null) {
                        throw new s0("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, b10.d());
                    if (!file5.exists()) {
                        throw new s0(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        cb.c0.a(th, th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
