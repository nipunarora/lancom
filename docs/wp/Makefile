all:	main 

main:	main.pdf

main.pdf: *.tex *.bib
	pdflatex main
	bibtex main
	pdflatex main
	pdflatex main
	pdflatex main

clean:
	rm -f *.aux *.bbl *.blg *.log *.dvi *.bak *~ main.pdf
