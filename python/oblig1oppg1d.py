import matplotlib.pyplot as plt
import numpy as np

if __name__ == '__main__':
    print("Oppgave 1")

    x = np.linspace(2, 6, num=100)

    fx = []
    for i in range(len(x)):
        fx.append(x[i] - np.sqrt((2 * x[i]) - 4))

    plt.plot(x, fx)
    plt.gca().yaxis.set_major_locator(plt.MultipleLocator(0.2))
    plt.grid()
    plt.axvline()
    plt.axhline()
    plt.show()
