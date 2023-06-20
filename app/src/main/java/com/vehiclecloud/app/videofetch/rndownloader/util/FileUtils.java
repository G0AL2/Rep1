package com.vehiclecloud.app.videofetch.rndownloader.util;

import android.text.format.DateFormat;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;
import qe.k;

/* compiled from: FileUtils.kt */
/* loaded from: classes3.dex */
public final class FileUtils {
    private static final String DATE_PATTERN = "yyyyMMddhhmmss";
    public static final FileUtils INSTANCE = new FileUtils();

    private FileUtils() {
    }

    private final File buildFile(String str, String str2, String str3) {
        return new File(str, str2 + '.' + str3);
    }

    private final String buildValidFatFilename(String str, int i10) {
        int i11 = 0;
        if (!(str == null || str.length() == 0) && !k.a(".", str) && !k.a("..", str)) {
            StringBuilder sb2 = new StringBuilder(str.length());
            while (i11 < str.length()) {
                char charAt = str.charAt(i11);
                i11++;
                if (isValidFatFilenameChar(charAt)) {
                    sb2.append(charAt);
                } else {
                    sb2.append('_');
                }
            }
            trimFilename(sb2, 255 - i10);
            String sb3 = sb2.toString();
            k.e(sb3, "res.toString()");
            return sb3;
        }
        CharSequence format = DateFormat.format(DATE_PATTERN, System.currentTimeMillis());
        Objects.requireNonNull(format, "null cannot be cast to non-null type kotlin.String");
        return (String) format;
    }

    private final boolean isValidFatFilenameChar(char c10) {
        if (c10 >= 0 && c10 < ' ') {
            return false;
        }
        return !((((((((((((c10 == '\"' || c10 == '*') || c10 == '/') || c10 == ':') || c10 == '<') || c10 == '>') || c10 == '?') || c10 == '\\') || c10 == '|') || c10 == '\n') || c10 == '\r') || c10 == '#') || c10 == 127);
    }

    private final void trimFilename(StringBuilder sb2, int i10) {
        String sb3 = sb2.toString();
        k.e(sb3, "res.toString()");
        Charset charset = StandardCharsets.UTF_8;
        k.e(charset, "UTF_8");
        byte[] bytes = sb3.getBytes(charset);
        k.e(bytes, "this as java.lang.String).getBytes(charset)");
        if (bytes.length > i10) {
            int i11 = i10 - 3;
            while (bytes.length > i11) {
                sb2.deleteCharAt(sb2.length() / 2);
                String sb4 = sb2.toString();
                k.e(sb4, "res.toString()");
                Charset charset2 = StandardCharsets.UTF_8;
                k.e(charset2, "UTF_8");
                bytes = sb4.getBytes(charset2);
                k.e(bytes, "this as java.lang.String).getBytes(charset)");
            }
            sb2.insert(sb2.length() / 2, "...");
        }
    }

    public final File buildUniqueFileWithExtension(String str, String str2, String str3) {
        k.f(str, "parent");
        k.f(str3, "ext");
        int length = str.length() + str3.length();
        String buildValidFatFilename = buildValidFatFilename(str2, length);
        File buildFile = buildFile(str, buildValidFatFilename, str3);
        File buildFile2 = buildFile(str, k.l(".", buildValidFatFilename), "a");
        while (true) {
            if (!buildFile.exists() && !buildFile2.exists()) {
                return buildFile;
            }
            String uuid = UUID.randomUUID().toString();
            k.e(uuid, "randomUUID().toString()");
            StringBuilder sb2 = new StringBuilder(buildValidFatFilename + '-' + uuid);
            trimFilename(sb2, length);
            String sb3 = sb2.toString();
            k.e(sb3, "nameBuilder.toString()");
            File buildFile3 = buildFile(str, sb3, str3);
            buildFile2 = buildFile(str, k.l(".", sb3), "a");
            buildFile = buildFile3;
        }
    }
}
