package b7;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: JSStackTrace.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f4884a = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    public static String a(String str, ReadableArray readableArray) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(", stack:\n");
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            ReadableMap map = readableArray.getMap(i10);
            sb2.append(map.getString("methodName"));
            sb2.append("@");
            sb2.append(b(map));
            if (map.hasKey("lineNumber") && !map.isNull("lineNumber") && map.getType("lineNumber") == ReadableType.Number) {
                sb2.append(map.getInt("lineNumber"));
            } else {
                sb2.append(-1);
            }
            if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                sb2.append(":");
                sb2.append(map.getInt("column"));
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    private static String b(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String || (string = readableMap.getString("file")) == null) {
            return "";
        }
        Matcher matcher = f4884a.matcher(string);
        if (matcher.find()) {
            return matcher.group(1) + ":";
        }
        return "";
    }
}
