# 命令模式
将命令与实现抽象出来，每个命令对应一个或多个实现对象，Invoker类只参与指挥Command类，尽量隐藏实现类。
该设计模式的目的主要是将客户调用以及具体实现分开，Invoker和Command作为中间类，客户只提出命令即可
如果有N个命令，则会产生N个Command类，所以需要衡量是否使用。在使用过程中，可以与模板模式等结合起来