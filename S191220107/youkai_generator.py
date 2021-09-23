import cv2

result = open("youkai.txt", "wt")
img = cv2.imread("c256.png")

for i in range(0, 16):
    for j in range(0, 16):
        point = img[13+27*i, 18+36*j]
        if i == 15 and j == 15:
            result.write(
                f"YK{i}_{j}_r{i*16+j}({point[2]}, {point[1]}, {point[0]});\n")
        else:
            result.write(
                f"YK{i}_{j}_r{i*16+j}({point[2]}, {point[1]}, {point[0]}),\n")
