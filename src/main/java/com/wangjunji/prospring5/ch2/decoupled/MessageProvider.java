package com.wangjunji.prospring5.ch2.decoupled;

/**
 * 如果对该应用程序的进行进一步的扩展，更好的解决方案
 * 是将渲染和消息检索逻辑重构为单独的组件，
 * 如果真的想让应用程序更加灵活，应该让这些组件实现接口和使用这些接口的启动程序之间的相互依赖关系，通过重构
 * 检索逻辑。
 */
public interface MessageProvider {
    String getMessage();
}
