package com.stub;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.qihoo.util.C0002;
import dalvik.system.DexFile;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class StubApp extends Application {
    private static boolean loadFromLib = false;
    private static boolean needX86Bridge = false;
    public static String strEntryApplication = "entryRunApplication";

    /* renamed from: ᵢˋ */
    private static Application f2 = null;

    /* renamed from: ᵢˎ */
    private static Application f3 = null;

    /* renamed from: ᵢˏ */
    private static String f4 = "libjiagu";

    /* renamed from: ᵢˑ */
    private static Context f5;

    /* renamed from: ᵢי */
    private static String f6 = null;

    /* renamed from: ᵢـ */
    private static String f7 = null;

    /* renamed from: ᵢٴ */
    private static String f8 = null;

    /* renamed from: ᵢᐧ */
    private static String f9 = null;

    /* renamed from: ᵢᴵ */
    private static String f10 = null;

    /* renamed from: ᵢᵎ */
    private static Map<Integer, String> f11 = new ConcurrentHashMap();

    public static native void interface11(int i);

    public static native Enumeration<String> interface12(DexFile dexFile);

    public static native long interface13(int i, long j, long j2, long j3, int i2, int i3, long j4);

    public static native String interface14(int i);

    public static native AssetFileDescriptor interface17(AssetManager assetManager, String str);

    public static native InputStream interface18(Class cls, String str);

    public static native InputStream interface19(ClassLoader classLoader, String str);

    public static native void interface20();

    public static native void interface21(Application application);

    public static native void interface22(int i, String[] strArr, int[] iArr);

    public static native void interface5(Application application);

    public static native String interface6(String str);

    public static native boolean interface7(Application application, Context context);

    public static native boolean interface8(Application application, Context context);

    public static native Location mark(LocationManager locationManager, String str);

    public static native void mark();

    public static native void mark(Location location);

    public static native synchronized Object n010333(Object obj, Object obj2);

    public static native void n0110();

    public static native int n0111();

    public static native void n01110(int i);

    public static native void n011110(int i, int i2);

    public static native boolean n011111(boolean z, int i);

    public static native void n0111110(int i, int i2, boolean z);

    public static native float n0111111(int i, int i2, float f);

    public static native long n011111111112(float f, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    public static native long n0111111112(float f, float f12, float f13, float f14, float f15, float f16);

    public static native long n011111112(float f, float f12, float f13, float f14, boolean z);

    public static native int n0111111131(int i, int i2, int i3, int i4, int i5, Object obj);

    public static native long n01111112(float f, float f12, float f13, boolean z);

    public static native long n0111112(float f, float f12, float f13);

    public static native long n011112(int i, int i2);

    public static native long n01112(float f);

    public static native void n011120(int i, long j);

    public static native void n0111210(int i, long j, boolean z);

    public static native boolean n0111211(int i, long j, int i2);

    public static native void n01112110(int i, long j, float f, float f12);

    public static native void n011121110(int i, long j, boolean z, int i2, int i3);

    public static native void n01112111110(int i, long j, int i2, int i3, int i4, int i5, int i6);

    public static native void n011121111110(int i, long j, int i2, int i3, int i4, int i5, int i6, int i7);

    public static native boolean n0111211113111(int i, long j, int i2, int i3, float f, float f12, Object obj, boolean z, boolean z2);

    public static native void n0111211130(int i, long j, int i2, int i3, int i4, Object obj);

    public static native Object n01112113(int i, long j, int i2, int i3);

    public static native long n0111212(int i, long j, int i2);

    public static native Object n0111213(int i, long j, boolean z);

    public static native long n011122(int i, long j);

    public static native void n0111220(int i, long j, long j2);

    public static native void n01112210(int i, long j, long j2, int i2);

    public static native void n0111230(int i, long j, Object obj);

    public static native void n01112310(int i, long j, Object obj, int i2);

    public static native boolean n0111231131(int i, long j, Object obj, boolean z, boolean z2, Object obj2);

    public static native void n011123130(int i, long j, Object obj, int i2, Object obj2);

    public static native void n011123210(int i, long j, Object obj, long j2, int i2);

    public static native Object n0111233(int i, long j, Object obj);

    public static native void n01112330(int i, long j, Object obj, Object obj2);

    public static native long n01112332(int i, long j, Object obj, Object obj2);

    public static native void n01112333111111110(int i, long j, Object obj, Object obj2, Object obj3, int i2, int i3, int i4, float f, boolean z, int i5, int i6, int i7);

    public static native void n0111233330(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object n01113(int i);

    public static native boolean n0111311(int i, Object obj, int i2);

    public static native long n011132(int i, Object obj);

    public static native int n0111331(int i, Object obj, Object obj2);

    public static native long n0112();

    public static native void n01120(long j);

    public static native float n01121(long j);

    public static native void n011210(long j, int i);

    public static native boolean n011211(long j, int i);

    public static native void n0112110(long j, int i, int i2);

    public static native void n01121110(long j, int i, int i2, int i3);

    public static native float n0112111111(long j, int i, int i2, int i3, int i4, int i5);

    public static native void n0112111111111110(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, float f12, float f13, int i8);

    public static native void n011211130(long j, int i, int i2, int i3, Object obj);

    public static native void n01121130(long j, float f, float f12, Object obj);

    public static native boolean n01121131(long j, int i, int i2, Object obj);

    public static native double n01122(long j);

    public static native void n011220(long j, long j2);

    public static native void n0112210(long j, long j2, int i);

    public static native void n0112220(long j, double d, double d2);

    public static native void n01122210(long j, long j2, long j3, int i);

    public static native Object n0112223(long j, double d, double d2);

    public static native void n011230(long j, Object obj);

    public static native int n011231(long j, Object obj);

    public static native void n01123110(long j, Object obj, int i, int i2);

    public static native void n0112311331111120(long j, Object obj, int i, float f, Object obj2, Object obj3, float f12, float f13, float f14, float f15, int i2, double d);

    public static native int n0112331(long j, Object obj, Object obj2);

    public static native void n0112331110(long j, Object obj, Object obj2, int i, int i2, float f);

    public static native void n011233111110(long j, Object obj, Object obj2, int i, int i2, float f, float f12, float f13);

    public static native void n01123311130(long j, Object obj, Object obj2, int i, int i2, float f, Object obj3);

    public static native Object n0113();

    public static native void n01130(Object obj);

    public static native int n01131(Object obj);

    public static native void n011310(Object obj, int i);

    public static native boolean n011311(Object obj, boolean z);

    public static native int n0113111(Object obj, int i, int i2);

    public static native void n011311111111111131110(Object obj, int i, float f, int i2, float f12, float f13, float f14, float f15, float f16, float f17, boolean z, boolean z2, boolean z3, Object obj2, int i3, int i4, boolean z4);

    public static native void n011311131313110(Object obj, int i, float f, int i2, Object obj2, int i3, Object obj3, int i4, Object obj4, int i5, int i6);

    public static native void n01131131110(Object obj, int i, int i2, Object obj2, int i3, float f, float f12);

    public static native void n0113113113113110(Object obj, int i, float f, Object obj2, float f12, int i2, Object obj3, int i3, float f13, Object obj4, int i4, int i5);

    public static native void n011311313113110(Object obj, int i, float f, Object obj2, int i2, Object obj3, int i3, int i4, Object obj4, int i5, int i6);

    public static native long n01131132(Object obj, int i, int i2, Object obj2);

    public static native int n01131211(Object obj, int i, long j, int i2);

    public static native Object n011313(Object obj, boolean z);

    public static native void n0113130(Object obj, int i, Object obj2);

    public static native Object n0113133(Object obj, int i, Object obj2);

    public static native long n01131332(Object obj, int i, Object obj2, Object obj3);

    public static native Object n01132113(Object obj, long j, int i, boolean z);

    public static native void n0113220(Object obj, double d, double d2);

    public static native Object n011323(Object obj, long j);

    public static native Object n01133(Object obj);

    public static native void n011330(Object obj, Object obj2);

    public static native int n011331(Object obj, Object obj2);

    public static native boolean n0113311(Object obj, Object obj2, boolean z);

    public static native int n0113311111(Object obj, Object obj2, boolean z, boolean z2, int i, boolean z3);

    public static native Object n011333(Object obj, Object obj2);

    public static native void n0113330(Object obj, Object obj2, Object obj3);

    public static native long n0113331112(Object obj, Object obj2, Object obj3, float f, float f12, float f13);

    public static native long n01133312(Object obj, Object obj2, Object obj3, int i);

    public static native long n0113331333112(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, Object obj6, int i2, int i3);

    public static native Object n0113333(Object obj, Object obj2, Object obj3);

    public static native void n01133330(Object obj, Object obj2, Object obj3, Object obj4);

    public native synchronized void n1100();

    public native synchronized void n11030(Object obj);

    public native synchronized boolean n110331(Object obj, Object obj2);

    public native void n1110();

    public native int n1111();

    public native void n11110(boolean z);

    public native int n11111(boolean z);

    public native void n111110(boolean z, int i);

    public native int n111111(boolean z, boolean z2);

    public native void n111130(int i, Object obj);

    public native boolean n111131(int i, Object obj);

    public native boolean n11113311(int i, Object obj, Object obj2, int i2);

    public native void n11120(long j);

    public native long n11122(long j);

    public native void n111230(long j, Object obj);

    public native boolean n111231(long j, Object obj);

    public native boolean n1112311(long j, Object obj, boolean z);

    public native boolean n1112321(long j, Object obj, double d);

    public native int n11123211(long j, Object obj, long j2, int i);

    public native double n1112322(long j, Object obj, double d);

    public native Object n111233(long j, Object obj);

    public native boolean n1112331(long j, Object obj, Object obj2);

    public native Object n1112333(long j, Object obj, Object obj2);

    public native Object n1113();

    public native void n11130(Object obj);

    public native int n11131(Object obj);

    public native void n111310(Object obj, float f);

    public native void n11131110(Object obj, int i, int i2, int i3);

    public native Object n1113113(Object obj, boolean z, int i);

    public native void n11131130(Object obj, int i, int i2, Object obj2);

    public native void n1113130(Object obj, int i, Object obj2);

    public native Object n11133(Object obj);

    public native void n111330(Object obj, Object obj2);

    public native boolean n111331(Object obj, Object obj2);

    public native void n1113310(Object obj, Object obj2, boolean z);

    public native void n11133110(Object obj, Object obj2, boolean z, int i);

    public native void n1113330(Object obj, Object obj2, Object obj3);

    public native boolean n1113331(Object obj, Object obj2, Object obj3);

    public native void n11133310(Object obj, Object obj2, Object obj3, int i);

    public native void n111333133310(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, Object obj6, int i2);

    public native Object n1113333(Object obj, Object obj2, Object obj3);

    public native void n11133330(Object obj, Object obj2, Object obj3, Object obj4);

    public native boolean n11133331(Object obj, Object obj2, Object obj3, Object obj4);

    public static String getSoPath1() {
        return f7;
    }

    public static String getSoPath2() {
        return f8;
    }

    public static String getDir() {
        return f9;
    }

    public static Context getAppContext() {
        return f5;
    }

    public static Context getOrigApplicationContext(Context context) {
        if (context == f2) {
            return f3;
        }
        return context;
    }

    /* renamed from: ᵢˋ */
    private static Application m6(Context context) {
        ClassLoader classLoader;
        Class<?> loadClass;
        try {
            if (!(f3 != null || (classLoader = context.getClassLoader()) == null || (loadClass = classLoader.loadClass(strEntryApplication)) == null)) {
                f3 = (Application) loadClass.newInstance();
            }
        } catch (Exception e) {
        }
        return f3;
    }

    public final void onCreate() {
        System.currentTimeMillis();
        super.onCreate();
        try {
            interface7(f3, f2.getBaseContext());
        } catch (Exception e) {
        }
        if (f3 != null) {
            f3.onCreate();
        }
        interface21(f3);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        boolean r0;
        System.currentTimeMillis();
        super.attachBaseContext(context);
        C0002.m5();
        f5 = context;
        if (f2 == null) {
            f2 = this;
        }
        if (f3 == null) {
            Boolean valueOf = Boolean.valueOf(C0002.m2());
            Boolean bool = false;
            Boolean bool2 = false;
            if (Build.CPU_ABI.contains("64") || Build.CPU_ABI2.contains("64")) {
                bool = true;
            }
            if (Build.CPU_ABI.contains("mips") || Build.CPU_ABI2.contains("mips")) {
                bool2 = true;
            }
            if (valueOf.booleanValue() && needX86Bridge) {
                System.loadLibrary("X86Bridge");
            }
            if (!loadFromLib) {
                String absolutePath = context.getFilesDir().getParentFile().getAbsolutePath();
                try {
                    absolutePath = context.getFilesDir().getParentFile().getCanonicalPath();
                } catch (Exception e) {
                }
                String str = absolutePath + "/.jiagu";
                f10 = m7(str, bool.booleanValue(), bool2.booleanValue());
                f6 = m7(str, false, false);
                f7 = str + File.separator + f6;
                f8 = str + File.separator + f10;
                f9 = str;
                if (bool2.booleanValue()) {
                    C0002.m3(context, f4 + "_mips.so", str, f6);
                } else if (!valueOf.booleanValue() || needX86Bridge) {
                    C0002.m3(context, f4 + ".so", str, f6);
                } else {
                    C0002.m3(context, f4 + "_x86.so", str, f6);
                }
                if (!bool.booleanValue() || bool2.booleanValue()) {
                    System.load(str + "/" + f6);
                } else {
                    if (!valueOf.booleanValue() || needX86Bridge) {
                        r0 = C0002.m3(context, f4 + "_a64.so", str, f10);
                    } else {
                        r0 = C0002.m3(context, f4 + "_x64.so", str, f10);
                    }
                    if (r0) {
                        System.load(str + "/" + f10);
                    } else {
                        System.load(str + "/" + f6);
                    }
                }
            } else if (!valueOf.booleanValue() || needX86Bridge) {
                System.loadLibrary("jiagu");
            } else {
                System.loadLibrary("jiagu_x86");
            }
        }
        interface5(f2);
        if (f3 == null) {
            f3 = m6(context);
            if (f3 != null) {
                try {
                    Method declaredMethod = Application.class.getDeclaredMethod("attach", new Class[]{Context.class});
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(f3, new Object[]{context});
                    }
                    interface8(f3, context);
                } catch (Exception e2) {
                    throw new RuntimeException("Failed to call attachBaseContext.", e2);
                }
            } else {
                System.exit(1);
            }
        }
    }

    /* renamed from: ᵢˋ */
    private static String m7(String str, boolean z, boolean z2) {
        String str2 = f4;
        if (Build.VERSION.SDK_INT < 23) {
            str2 = str2 + str.hashCode();
        }
        if (!z || z2) {
            return str2 + ".so";
        }
        return str2 + "_64.so";
    }

    public static String getString2(int i) {
        String str = f11.get(Integer.valueOf(i));
        if (str == null) {
            str = interface14(i);
            f11.put(Integer.valueOf(i), str);
        }
        if (str != null) {
            return str.intern();
        }
        return str;
    }

    public static String getString2(String str) {
        try {
            return getString2(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }
}
