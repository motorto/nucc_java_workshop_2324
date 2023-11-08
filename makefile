OUTPUT="presentation.pdf"

main:
	pandoc -t beamer presentation.md -o ${OUTPUT}
