编译出现问题：
    Class kotlin.reflect.jvm.internal.FunctionCaller$FieldSetter can not access a member of class
    com.android.build.gradle.tasks.ManifestProcessorTask with modifiers "private"

   解决办法：修改build.gradle
      classpath 'com.android.tools.build:gradle:3.3.0-alpha12'
      修改为：classpath 'com.android.tools.build:gradle:3.3.0'



