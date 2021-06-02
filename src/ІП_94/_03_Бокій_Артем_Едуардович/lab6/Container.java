package ІП_94._03_Бокій_Артем_Едуардович.lab6;

public class Container {
    private ContainerInterface containerInterface;
    private SortingMethod sortingMethod;

    public void setContainerType(ContainerInterface containerInterface) {
        this.containerInterface = containerInterface;
    }

    public void setSortingMethod(SortingMethod sortingMethod) {
        System.out.println("Sorting method set to " + sortingMethod.getClass().getName());
        this.sortingMethod = sortingMethod;
    }

    public Object[] executeSorting() {
        System.out.println("Container executeSorting called");
        return containerInterface.getSortedContainer(sortingMethod);
    }
}
